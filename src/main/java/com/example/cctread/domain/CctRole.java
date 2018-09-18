package com.example.cctread.domain;

/**
 * @Auther: caic
 * @Date: 2018/8/24 20:02
 * @Description:
 * @Version: 1.0
 */
public class CctRole {
    private String roleId;
    private String roleName;
    private String describe;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
