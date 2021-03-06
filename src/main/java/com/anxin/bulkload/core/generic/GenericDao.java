package com.anxin.bulkload.core.generic;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午1:58:11  
 * 项目名称：bulkload
 * 文件名称：GenericDao.java   
 * @version 1.0   
 * @param <Model> 代表数据库中的表 映射的Java对象类型
 * @param <PK> 代表对象的主键类型
 * 类说明：所有自定义Dao的顶级接口, 封装常用的增删查改操作,
 * 可以通过Mybatis Generator Maven 插件自动生成Dao,
 * 也可以手动编码,然后继承GenericDao 即可.
 */
public interface GenericDao<Model, PK> {

    /**
     * 插入对象
     *
     * @param model 对象
     */
    int insertSelective(Model model);

    /**
     * 更新对象
     *
     * @param model 对象
     */
    int updateByPrimaryKeySelective(Model model);

    /**
     * 通过主键, 删除对象
     *
     * @param id 主键
     */
    int deleteByPrimaryKey(PK id);

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return
     */
    Model selectByPrimaryKey(PK id);

}
