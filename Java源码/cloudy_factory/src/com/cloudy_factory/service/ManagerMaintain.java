package com.cloudy_factory.service;

import java.util.Scanner;

import com.cloudy_factory.entity.MnMaintainer;

public class ManagerMaintain {
	private void managermaintain() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("�������豸���");
		String deviceid=scanner.next();
		System.out.printf("�������Ʒ���");
		String productid=scanner.next();
		System.out.printf("���������");
		String capacity=scanner.next();
		MnMaintainer MM=new MnMaintainer(deviceid, productid, capacity);
		
		
	}
}
