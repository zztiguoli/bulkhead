package com.anxin.bulkload.web.security;

/**
 * 
 * @author guoli
 * 创建时间：2016年8月8日 下午2:08:49  
 * 项目名称：bulkload
 * 文件名称：PermissionSign.java   
 * @version 1.0    
 * 类说明：
 * 权限标识配置类, <br>
 * 与 permission 权限表中的 permission_sign 字段相对应 <br>
 * 使用:
 * 
 * <pre>
 * &#064;RequiresPermissions(value = PermissionConfig.USER_CREATE)
 * public String create() {
 *     return &quot;拥有user:create权限,能访问&quot;;
 * }
 * </pre>
 */
public class PermissionSign {

    /**
     * 用户新增权限 标识
     */
    public static final String USER_CREATE = "user:create";

    /**
     * 用户删除权限 标识
     */
    public static final String USER_DELETE = "user:delete";

    /**
     * 添加更多...
     */

}
