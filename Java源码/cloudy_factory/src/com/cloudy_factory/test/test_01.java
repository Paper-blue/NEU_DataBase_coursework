package com.cloudy_factory.test;

import java.util.Scanner;


import com.cloudy_factory.service.ChooseTender;
import com.cloudy_factory.service.MakeOrder;
import com.cloudy_factory.service.Register;

public class test_01 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("��ѡ��ʵ�ֹ��ܣ�\n");
		System.out.printf("1.�û�ע��\n");
		System.out.printf("2.�������²ɹ�����\n");
		System.out.printf("3.������ѡ��\n");
		System.out.printf("4.�ƹ�������Ա���ò��������豸\n");
		System.out.printf("5.�ƹ�������Աά���豸����\n");
		System.out.printf("6.�ƹ�������Ա�����Ų�\n");

		String choice=scanner.next();
		if ("1".equals(choice)) {
			System.out.printf("��ת��\n");
				Register tRegister=new Register();
				tRegister.register();
		}
		else if ("2".equals(choice)) {
			System.out.printf("��ת��\n");

				MakeOrder tMakeOrder=new MakeOrder();
				tMakeOrder.makeorder();
		}
		else if ("3".equals(choice)) {
			System.out.printf("��ת��\n");
				ChooseTender tChooseTender=new ChooseTender();
				tChooseTender.choosetender();
	}
		else {
			System.out.printf("��ת��\n");

		}


	}
}
