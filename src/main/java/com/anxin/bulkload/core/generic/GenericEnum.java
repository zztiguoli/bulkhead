package com.anxin.bulkload.core.generic;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午1:59:39  
 * 项目名称：bulkload
 * 文件名称：GenericEnum.java   
 * @version 1.0    
 * 类说明：所有自定义枚举类型实现该接口
 */
public interface GenericEnum {

    /**
     * value: 为保存在数据库中的值
     */
    public String getValue();

    /**
     * text : 为前端显示值
     */
    public String getText();

}
