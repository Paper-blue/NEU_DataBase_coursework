package com.cloudy_factory.service;

import java.sql.Date;
import java.util.Scanner;

import com.cloudy_factory.entity.ManageRenter;

public class RentManager {
	private void rentmanager() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("�������豸���");
		String deviceid=scanner.next();
		//System.out.printf("�����뿪ʼʱ��");
		//Date begindate=scanner.next();
		System.out.printf("������ʱ��");
		int length=scanner.nextInt();
		System.out.printf("�����빤�����");
		String factoryid=scanner.next();
		ManageRenter MR=new ManageRenter(deviceid, null, length, factoryid);
	}
}
