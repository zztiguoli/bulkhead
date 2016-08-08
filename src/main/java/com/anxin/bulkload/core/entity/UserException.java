package com.anxin.bulkload.core.entity;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午1:56:58  
 * 项目名称：bulkload
 * 文件名称：UserException.java   
 * @version 1.0    
 * 类说明：UserException : 用户自定义异常
 */
public class UserException extends RuntimeException {

    /**
     * 异常发生时间
     */
    private long date = System.currentTimeMillis();

    public long getDate() {
        return date;
    }
}
