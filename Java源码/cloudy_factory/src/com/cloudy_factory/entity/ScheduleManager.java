package com.cloudy_factory.entity;

import java.sql.Date;

public class ScheduleManager {
	private int TID;
	private String Tdeviceid;
	private Date Tbegindate;
	private Date Tenddate;
	public ScheduleManager(int tID, String tdeviceid, Date tbegindate, Date tenddate) {
		super();
		TID = tID;
		Tdeviceid = tdeviceid;
		Tbegindate = tbegindate;
		Tenddate = tenddate;
	}
	public int getTID() {
		return TID;
	}
	public void setTID(int tID) {
		TID = tID;
	}
	public String getTdeviceid() {
		return Tdeviceid;
	}
	public void setTdeviceid(String tdeviceid) {
		Tdeviceid = tdeviceid;
	}
	public Date getTbegindate() {
		return Tbegindate;
	}
	public void setTbegindate(Date tbegindate) {
		Tbegindate = tbegindate;
	}
	public Date getTenddate() {
		return Tenddate;
	}
	public void setTenddate(Date tenddate) {
		Tenddate = tenddate;
	}
	
}
