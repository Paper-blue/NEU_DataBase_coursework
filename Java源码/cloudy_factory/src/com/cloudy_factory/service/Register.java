package com.cloudy_factory.service;

import java.util.Scanner;

import com.cloudy_factory.user.Cloudy_user;

public class Register {
	public void register() {
     //���ܲ���
		Scanner scanner=new Scanner(System.in);
		System.out.printf("�������û���");
		String login_name=scanner.next();
		System.out.printf("����������");
		String password=scanner.next();
		System.out.printf("����������");
		String user_name=scanner.next();
		System.out.printf("��������ϵ��ʽ");
		String mobile=scanner.next();
		System.out.printf("������ְ����Ϣ��2Ϊ����Ա��3Ϊ�����̣�");
		int uSER_ROLEID=scanner.nextInt();
		System.out.printf("�����빤������");
		String factoryname=scanner.next();
		System.out.printf("��������");
		String introduction=scanner.next();
		//Cloudy_user u=new Cloudy_user(login_name, password, user_name, mobile, uSER_ROLEID, factoryname, introduction);
		
		
		//USERDao.reg(u.getLogin_name(),u.getPassword(),u.getUser_name(),u.getMobile(),u.getUSER_ROLEID(),u.getFactoryname(),u.getIntroduction());
		int count= USERDao.reg(login_name, password, user_name, mobile, uSER_ROLEID, factoryname, introduction);
		if(count>0) {
			System.out.printf("ע��ɹ�");
		}else {
			System.out.printf("ע��ɹ�");

		}
	}
}
	
