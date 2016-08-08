package com.anxin.bulkload.web.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anxin.bulkload.web.model.User;
import com.anxin.bulkload.web.service.UserService;


/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午2:01:32  
 * 项目名称：bulkload
 * 文件名称：UserController.java   
 * @version 1.0    
 * 类说明：用户控制器
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 用户登录
     * 
     * @param user
     * @param result
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@Valid User user, BindingResult result, Model model, HttpServletRequest request) {
        try {
          
            // 已登陆则 跳到首页
            if (request.getSession().getAttribute("userInfo")!=null) {
                return "redirect:/";
            }
            if (result.hasErrors()) {
                model.addAttribute("error", "参数错误！");
                return "login";
            }
            // 身份验证TODO
           
            // 验证成功在Session中保存用户信息
            final User authUserInfo = userService.selectByUsername(user.getUsername());
            request.getSession().setAttribute("userInfo", authUserInfo);
        } catch (AuthenticationException e) {
            // 身份验证失败
            model.addAttribute("error", "用户名或密码错误 ！");
            return "login";
        }
        return "redirect:/";
    }

    /**
     * 用户登出
     * 
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("userInfo");
        // 登出操作
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }
    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
   public String getAllUser(Model model, HttpServletRequest request){
    	List<User> list = userService.selectList();
    	System.out.println(list);
    	request.setAttribute("list", list);
    	return "userList";
   }
}
