package com.cloudy_factory.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.cloudy_factory.entity.OrderMaker;

public class MakeOrder {
	public void makeorder() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("请输入订单编号");
		String orderno=scanner.next();
		System.out.printf("请输入产品id");
		String productid=scanner.next();
		System.out.printf("请输入采购数量");
		int ordernum=scanner.nextInt();
		
		System.out.printf("请输入交付日期(格式yyyy-MM-dd)");
		String string =scanner.next();;//输入想要添加的生日
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //设置日期格式  yyyy-MM-dd-HH-mm-ss这个是完整的
		Date deadtime = null;
		try {
			deadtime = (Date) dateFormat.parse(string);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//将字符串转换成date类型数据

		System.out.printf("请输入投标截至日期(格式yyyy-MM-dd)");
		String string1 =scanner.next();;//输入想要添加的生日
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date deliverDate = null;
		try {
			deliverDate = (Date) dateFormat.parse(string1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//将字符串转换成date类型数据

		System.out.printf("请输入收货人");
		String rec_id=scanner.next();
		System.out.printf("请输入收货地址");
		String address=scanner.next();
		System.out.printf("请输入收货人联系方式");
		String mobile=scanner.next();
		//OrderMaker OM=new OrderMaker(orderno, productid, ordernum, null, null, rec_id, address, mobile);
		int count= USERDao.mkorder(orderno, productid, ordernum,deadtime ,deliverDate, rec_id, address, mobile);
		if(count>0) {
			System.out.printf("添加成功");
		}else {
			System.out.printf("添加失败");

		}
	}
}