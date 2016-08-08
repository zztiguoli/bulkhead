package com.anxin.bulkload.core.entity;


/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午1:56:20  
 * 项目名称：bulkload
 * 文件名称：JSONResult.java   
 * @version 1.0   
 * @param <T> 
 * 类说明：JSONResult : Response JSONResult for RESTful,封装返回JSON格式的数据
 */

public class JSONResult<T> extends Result {

    private static final long serialVersionUID = 7880907731807860636L;

    /**
     * 数据
     */
    private T data;


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public JSONResult() {
        super();
    }

    /**
     * 自定义返回的结果
     *
     * @param data
     * @param message
     * @param success
     */
    public JSONResult(T data, String message, boolean success) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(success);
    }

    /**
     * 成功返回数据和消息
     *
     * @param data
     * @param message
     */
    public JSONResult(T data, String message) {
        this.data = data;
        super.setMessage(message);
        super.setSuccess(true);
    }

    /**
     * 成功返回数据
     *
     * @param data
     */
    public JSONResult(T data) {
        this.data = data;
        super.setSuccess(true);
    }
}