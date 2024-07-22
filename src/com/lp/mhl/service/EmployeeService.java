package com.lp.mhl.service;

import com.lp.mhl.dao.EmployeeDao;
import com.lp.mhl.domain.Employee;

public class EmployeeService {
    private EmployeeDao employeeDao = new EmployeeDao();

    /**
     * 登录
     * @param empId 账号
     * @param pwd 密码
     * @return
     */
    public Employee login(String empId, String pwd) {
        Employee employee =
                employeeDao.querySingle("select * from employee where empId=? and pwd=MD5(?)", Employee.class, empId, pwd);
        return employee;
    }

    /**
     * 修改用户数据
     * @param employee
     * @return
     */
    public int update(Employee employee) {
        int update = employeeDao.update("update employee set empId=?,pwd=?,name=?,roleId=? where id=?", employee.getEmpId(),
                employee.getPwd(), employee.getName(), employee.getRoleId(), employee.getId());
        return update;
    }

}
