package com.cloudy_factory.service;

import java.util.Scanner;

import com.cloudy_factory.user.Cloudy_user;

public class Register {
	public void register() {
     //接受参数
		Scanner scanner=new Scanner(System.in);
		System.out.printf("请输入用户名");
		String login_name=scanner.next();
		System.out.printf("请输入密码");
		String password=scanner.next();
		System.out.printf("请输入姓名");
		String user_name=scanner.next();
		System.out.printf("请输入联系方式");
		String mobile=scanner.next();
		System.out.printf("请输入职务信息（2为管理员，3为经销商）");
		int uSER_ROLEID=scanner.nextInt();
		System.out.printf("请输入工厂名称");
		String factoryname=scanner.next();
		System.out.printf("请输入简介");
		String introduction=scanner.next();
		//Cloudy_user u=new Cloudy_user(login_name, password, user_name, mobile, uSER_ROLEID, factoryname, introduction);
		
		
		//USERDao.reg(u.getLogin_name(),u.getPassword(),u.getUser_name(),u.getMobile(),u.getUSER_ROLEID(),u.getFactoryname(),u.getIntroduction());
		int count= USERDao.reg(login_name, password, user_name, mobile, uSER_ROLEID, factoryname, introduction);
		if(count>0) {
			System.out.printf("注册成功");
		}else {
			System.out.printf("注册成功");

		}
	}
}
	
