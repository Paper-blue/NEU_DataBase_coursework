package com.cloudy_factory.entity;

public class MnMaintainer {
	private String deviceid;
	private String productid;
	private String capacity;
	public MnMaintainer(String deviceid, String productid, String capacity) {
		super();
		this.deviceid = deviceid;
		this.productid = productid;
		this.capacity = capacity;
	}
	public String getDeviceid() {
		return deviceid;
	}
	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
}
