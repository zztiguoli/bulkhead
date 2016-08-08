package com.anxin.bulkload.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午2:01:19  
 * 项目名称：bulkload
 * 文件名称：PageController.java   
 * @version 1.0    
 * 类说明：视图控制器,返回jsp视图给前端
 */
@Controller
@RequestMapping("/page")
public class PageController {

    /**
     * 登录页
     */
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * dashboard页
     */
    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    /**
     * 404页
     */
    @RequestMapping("/404")
    public String error404() {
        return "404";
    }

    /**
     * 401页
     */
    @RequestMapping("/401")
    public String error401() {
        return "401";
    }

    /**
     * 500页
     */
    @RequestMapping("/500")
    public String error500() {
        return "500";
    }

}