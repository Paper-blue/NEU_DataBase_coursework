package com.cloudy_factory.service;

import java.util.Scanner;

import com.cloudy_factory.entity.ScheduleManager;

public class ManageSchedule {
	public void manageschedule() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("�������Ų���ϸID");
		int tID=scanner.nextInt();
		System.out.printf("�������豸ID");
		String tdeviceid=scanner.next();
		//System.out.printf("�����뿪ʼʱ��");
		//String tbegindate=scanner.next();
		//System.out.printf("���������ʱ��");
		//String tenddate=scanner.next();
		ScheduleManager SM=new ScheduleManager(tID, tdeviceid, null, null);
	}
}
