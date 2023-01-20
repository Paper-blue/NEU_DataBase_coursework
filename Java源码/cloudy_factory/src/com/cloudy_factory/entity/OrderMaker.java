package com.cloudy_factory.entity;

import java.sql.Date;

public class OrderMaker {
	private String orderno;
	private String productid;
	private int ordernum;
	private Date deaddate;
	private Date deliverDate;
	private String rec_id;
	private String address;
	private String mobile;
	public OrderMaker(String orderno, String productid, int ordernum, Date deaddate, Date deliverDate, String rec_id,
			String address, String mobile) {
		super();
		this.orderno = orderno;
		this.productid = productid;
		this.ordernum = ordernum;
		this.deaddate = deaddate;
		this.deliverDate = deliverDate;
		this.rec_id = rec_id;
		this.address = address;
		this.mobile = mobile;
	}
	public String getOrderno() {
		return orderno;
	}
	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public int getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(int ordernum) {
		this.ordernum = ordernum;
	}
	public Date getDeaddate() {
		return deaddate;
	}
	public void setDeaddate(Date deaddate) {
		this.deaddate = deaddate;
	}
	public Date getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}
	public String getRec_id() {
		return rec_id;
	}
	public void setRec_id(String rec_id) {
		this.rec_id = rec_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
