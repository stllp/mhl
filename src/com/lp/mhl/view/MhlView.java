package com.lp.mhl.view;

import com.lp.mhl.dao.EmployeeDao;
import com.lp.mhl.utils.Utility;

public class MhlView {
    private boolean loop = true;

    public static void main(String[] args) {
        MhlView mhlView = new MhlView();
        mhlView.mainMenu();
    }
    public void mainMenu() {
        while (loop) {
            System.out.println("==================满汉楼===============");
            System.out.println("\t 1 登录");
            System.out.println("\t 9 退出");
            System.out.print("输入你的操作:");
            int key = Integer.parseInt(Utility.getString(1));
            switch (key) {
                case 1:
                    System.out.print("输入员工工号：");
                    String empId = Utility.getString(50);
                    System.out.print("输入员工密码：");
                    String pwd = Utility.getString(32);
                    EmployeeDao employeeDao = new EmployeeDao();
                    String dbPwd = (String) employeeDao.queryScalar("select pwd from employee where empId=?", empId);
                    pwd = (String) employeeDao.queryScalar("select MD5(?) from dual",pwd);
                    if (pwd.equals(dbPwd)) {
                        System.out.println("==========满汉楼(二级菜单)--" + empId + "===========");
                        System.out.println("\t 1 查看餐桌");
                        System.out.println("\t 2 预定就餐");
                        System.out.println("\t 3 开台");
                        System.out.println("\t 4 点餐");
                        System.out.println("\t 5 结账");
                        System.out.println("\t 6 菜品设置");
                        System.out.println("\t 9 退出系统");
                        System.out.print("输入你的选择:");
                        int key1 = Integer.parseInt(Utility.getString(1));
                        switch (key1) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 9:
                                loop = false;
//                                System.out.println("=========退出系统========");
                                break;
                        }
                    } else {
                        System.out.println("==========登录失败===========");
                    }
                case 9:
                    System.out.println("=========退出系统========");
                    loop = false;
                    break;
            }

        }
    }
}
