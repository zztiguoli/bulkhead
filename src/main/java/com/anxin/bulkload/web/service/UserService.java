package com.anxin.bulkload.web.service;

import com.anxin.bulkload.core.generic.GenericService;
import com.anxin.bulkload.web.model.User;
/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午2:09:51  
 * 项目名称：bulkload
 * 文件名称：UserService.java   
 * @version 1.0    
 * 类说明：用户业务接口
 */
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
