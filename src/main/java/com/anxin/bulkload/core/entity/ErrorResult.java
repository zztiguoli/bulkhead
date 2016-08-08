package com.anxin.bulkload.core.entity;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午1:55:55  
 * 项目名称：bulkload
 * 文件名称：ErrorResult.java   
 * @version 1.0    
 * 类说明：用于响应错误的请求的对象
 */
public class ErrorResult extends Result {
    private static final long serialVersionUID = 8567221653356186674L;

    /**
     * 封装多个 错误信息
     */
    private Map<String, Object> errors = new HashMap<>();

    public Map<String, Object> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, Object> errors) {
        this.errors = errors;
    }

    public ErrorResult() {

    }
}
