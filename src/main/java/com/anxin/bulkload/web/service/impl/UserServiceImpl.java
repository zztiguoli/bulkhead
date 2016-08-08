package com.anxin.bulkload.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.anxin.bulkload.core.generic.GenericDao;
import com.anxin.bulkload.core.generic.GenericServiceImpl;
import com.anxin.bulkload.web.dao.UserMapper;
import com.anxin.bulkload.web.model.User;
import com.anxin.bulkload.web.model.UserExample;
import com.anxin.bulkload.web.service.UserService;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午2:10:09  
 * 项目名称：bulkload
 * 文件名称：UserServiceImpl.java   
 * @version 1.0    
 * 类说明：用户Service实现类
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int insert(User model) {
        return userMapper.insertSelective(model);
    }

    @Override
    public int update(User model) {
        return userMapper.updateByPrimaryKeySelective(model);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authentication(user);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }
    
    @Override
    public List<User> selectList() {
    	 UserExample example = new UserExample();
         final List<User> list = userMapper.selectByExample(example);
    	return list;
    }

}
