package com.lp.mhl.domain;

/**
 * 雇员实体表
 */
public class Employee {
    private Integer id;
    private String empId;
    private String pwd;
    private String name;
    private String roleId;

    public Employee() {
    }

    public Employee(Integer id, String empId, String pwd, String name, String roleId) {
        this.id = id;
        this.empId = empId;
        this.pwd = pwd;
        this.name = name;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empId='" + empId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", roleId='" + roleId + '\'' +
                '}';
    }
}
