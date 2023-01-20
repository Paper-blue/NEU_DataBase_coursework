package com.cloudy_factory.service;

import java.sql.Date;
import java.util.Scanner;

import com.cloudy_factory.entity.ManageRenter;

public class RentManager {
	private void rentmanager() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("请输入设备编号");
		String deviceid=scanner.next();
		//System.out.printf("请输入开始时间");
		//Date begindate=scanner.next();
		System.out.printf("请输入时长");
		int length=scanner.nextInt();
		System.out.printf("请输入工厂编号");
		String factoryid=scanner.next();
		ManageRenter MR=new ManageRenter(deviceid, null, length, factoryid);
	}
}
