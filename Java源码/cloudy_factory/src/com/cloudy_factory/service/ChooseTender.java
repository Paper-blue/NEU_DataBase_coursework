package com.cloudy_factory.service;

import java.util.Scanner;

import com.cloudy_factory.entity.TenderChooser;

public class ChooseTender {
	public  void choosetender() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("请输入竞标id");
		int tender_id=scanner.nextInt();
		//TenderChooser TC=new TenderChooser(tender_id);
		int count=USERDao.choosetender(tender_id);
		if(count>0) {
			System.out.printf("选标成功");
		}else {
			System.out.printf("选标信息异常");

		}
	}
}
