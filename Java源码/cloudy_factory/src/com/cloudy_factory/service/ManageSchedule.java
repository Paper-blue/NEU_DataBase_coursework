package com.cloudy_factory.service;

import java.util.Scanner;

import com.cloudy_factory.entity.ScheduleManager;

public class ManageSchedule {
	public void manageschedule() {
		Scanner scanner=new Scanner(System.in);
		System.out.printf("请输入排产明细ID");
		int tID=scanner.nextInt();
		System.out.printf("请输入设备ID");
		String tdeviceid=scanner.next();
		//System.out.printf("请输入开始时间");
		//String tbegindate=scanner.next();
		//System.out.printf("请输入结束时间");
		//String tenddate=scanner.next();
		ScheduleManager SM=new ScheduleManager(tID, tdeviceid, null, null);
	}
}
