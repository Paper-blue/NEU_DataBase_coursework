package com.cloudy_factory.service;

import java.util.Scanner;

import com.cloudy_factory.entity.MnMaintainer;

public class ManagerMaintain {
	private void managermaintain() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("请输入设备编号");
		String deviceid=scanner.next();
		System.out.printf("请输入产品编号");
		String productid=scanner.next();
		System.out.printf("请输入产能");
		String capacity=scanner.next();
		MnMaintainer MM=new MnMaintainer(deviceid, productid, capacity);
		
		
	}
}
