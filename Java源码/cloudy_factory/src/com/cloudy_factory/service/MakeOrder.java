package com.cloudy_factory.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.cloudy_factory.entity.OrderMaker;

public class MakeOrder {
	public void makeorder() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("�����붩�����");
		String orderno=scanner.next();
		System.out.printf("�������Ʒid");
		String productid=scanner.next();
		System.out.printf("������ɹ�����");
		int ordernum=scanner.nextInt();
		
		System.out.printf("�����뽻������(��ʽyyyy-MM-dd)");
		String string =scanner.next();;//������Ҫ��ӵ�����
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); //�������ڸ�ʽ  yyyy-MM-dd-HH-mm-ss�����������
		Date deadtime = null;
		try {
			deadtime = (Date) dateFormat.parse(string);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//���ַ���ת����date��������

		System.out.printf("������Ͷ���������(��ʽyyyy-MM-dd)");
		String string1 =scanner.next();;//������Ҫ��ӵ�����
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date deliverDate = null;
		try {
			deliverDate = (Date) dateFormat.parse(string1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//���ַ���ת����date��������

		System.out.printf("�������ջ���");
		String rec_id=scanner.next();
		System.out.printf("�������ջ���ַ");
		String address=scanner.next();
		System.out.printf("�������ջ�����ϵ��ʽ");
		String mobile=scanner.next();
		//OrderMaker OM=new OrderMaker(orderno, productid, ordernum, null, null, rec_id, address, mobile);
		int count= USERDao.mkorder(orderno, productid, ordernum,deadtime ,deliverDate, rec_id, address, mobile);
		if(count>0) {
			System.out.printf("��ӳɹ�");
		}else {
			System.out.printf("���ʧ��");

		}
	}
}