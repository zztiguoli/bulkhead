package com.anxin.bulkload.core.entity;

import java.io.Serializable;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午1:56:35  
 * 项目名称：bulkload
 * 文件名称：Result.java   
 * @version 1.0    
 * 类说明：Result : 响应的结果对象
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 6288374846131788743L;

    /**
     * 信息
     */
    private String message;

    /**
     * 状态码
     */
    private int statusCode;

    /**
     * 是否成功
     */
    private boolean success;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Result() {

    }
}
