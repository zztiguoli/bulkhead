package com.anxin.bulkload.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.anxin.bulkload.core.feature.orm.mybatis.Page;
import com.anxin.bulkload.core.generic.GenericDao;
import com.anxin.bulkload.web.model.User;
import com.anxin.bulkload.web.model.UserExample;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午2:08:23  
 * 项目名称：bulkload
 * 文件名称：UserMapper.java   
 * @version 1.0    
 * 类说明：用户Dao接口
 */

public interface UserMapper extends GenericDao<User, Long> {
	/**
	 * 查询符合条件的用户的个数
	 * @param example 查询条件
	 * @return 符合条件的记录条数
	 */
    int countByExample(UserExample example);

    /**
     * 根据条件删除相应的记录
     * @param example 删除条件
     * @return 删除的记录的条数
     */
    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    /**
     * 向数据库中插入一条用户记录
     * @param record
     * @return
     */
    int insert(User record);

  
    int insertSelective(User record);

    /**
     * 根据条件查询用户列表
     * @param example
     * @return 符合条件用户记录列表
     */
    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    /**
     * 
     * @param record
     * @param example
     * @return
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * 
     * @param record
     * @param example
     * @return
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    /**
     * 
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);

    /**
     * 用户登录验证查询
     * 
     * @param record
     * @return
     */
    User authentication(@Param("record") User record);

    /**
     * 分页条件查询
     * 
     * @param page
     * @param example
     * @return
     */
    List<User> selectByExampleAndPage(Page<User> page, UserExample example);
}