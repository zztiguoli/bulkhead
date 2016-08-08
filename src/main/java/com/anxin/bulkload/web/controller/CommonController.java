package com.anxin.bulkload.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午2:00:43  
 * 项目名称：bulkload
 * 文件名称：CommonController.java   
 * @version 1.0    
 * 类说明：公共视图控制器
 */
@Controller
public class CommonController {
    /**
     * 首页
     * 
     * @param request
     * @return
     */
    @RequestMapping("index")
    public String index(HttpServletRequest request) {
        return "index";
    }

}