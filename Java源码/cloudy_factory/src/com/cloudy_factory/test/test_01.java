package com.cloudy_factory.test;

import java.util.Scanner;


import com.cloudy_factory.service.ChooseTender;
import com.cloudy_factory.service.MakeOrder;
import com.cloudy_factory.service.Register;

public class test_01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("请选择实现功能：\n");
		System.out.printf("1.用户注册\n");
		System.out.printf("2.经销商下采购订单\n");
		System.out.printf("3.经销商选标\n");
		System.out.printf("4.云工厂管理员租用产能中心设备\n");
		System.out.printf("5.云工厂管理员维护设备产能\n");
		System.out.printf("6.云工厂管理员订单排产\n");

		String choice=scanner.next();
		if ("1".equals(choice)) {
			System.out.printf("跳转中\n");
				Register tRegister=new Register();
				tRegister.register();
		}
		else if ("2".equals(choice)) {
			System.out.printf("跳转中\n");

				MakeOrder tMakeOrder=new MakeOrder();
				tMakeOrder.makeorder();
		}
		else if ("3".equals(choice)) {
			System.out.printf("跳转中\n");
				ChooseTender tChooseTender=new ChooseTender();
				tChooseTender.choosetender();
	}
		else {
			System.out.printf("跳转中\n");

		}


	}
}
