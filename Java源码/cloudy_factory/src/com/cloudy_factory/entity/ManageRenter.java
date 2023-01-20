package com.cloudy_factory.entity;

import java.sql.Date;

public class ManageRenter {
	private String deviceid;
	private Date begindate;
	private int length;
	private String factoryid;
	public ManageRenter(String deviceid, Date begindate, int length, String factoryid) {
		super();
		this.deviceid = deviceid;
		this.begindate = begindate;
		this.length = length;
		this.factoryid = factoryid;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public Date getBegindate() {
		return begindate;
	}
	public void setBegindate(Date begindate) {
		this.begindate = begindate;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getFactoryid() {
		return factoryid;
	}
	public void setFactoryid(String factoryid) {
		this.factoryid = factoryid;
	}
	
}
