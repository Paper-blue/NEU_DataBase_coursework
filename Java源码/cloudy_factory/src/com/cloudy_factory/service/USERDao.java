package com.cloudy_factory.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cloudy_factory.dao.Basedao;
import com.cloudy_factory.entity.ManageRenter;
import com.cloudy_factory.entity.MnMaintainer;
import com.cloudy_factory.entity.OrderMaker;
import com.cloudy_factory.entity.ScheduleManager;
import com.cloudy_factory.entity.TenderChooser;
import com.cloudy_factory.user.Cloudy_user;

public class USERDao {
	
	
	
	
	
		public static int reg(String login_name,String password,String username,String mobile,int roleid,String factoryname,String introduction) {
			//声明结果集
			ResultSet rs=null;
			int count =0;
			//获取连接对象
			Connection conn=Basedao.getconn();
			PreparedStatement ps=null;//预声明
			String sql="";
			try {
				sql = "{call pro_reg(?,?,?,?,?,?,?)}";
				ps=conn.prepareStatement(sql);
				ps.setString(1, login_name);
				ps.setString(2, password);
				ps.setString(3, username);
				ps.setString(4, mobile);
				ps.setInt(5, roleid);
				ps.setString(6, factoryname);
				ps.setString(7, introduction);
				rs=ps.executeQuery();
				count=ps.executeUpdate();
					
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				Basedao.closeall(rs, ps, conn);//记得关闭连接的资源
			}
			
			return count;
		}
			
			
	        
			//Object[] params= {
				//	u.getLogin_name(),
					//u.getPassword(),
					//u.getUser_name(),
					//u.getMobile(),
					//u.getUSER_ROLEID(),
					//u.getFactoryname(),
					//u.getIntroduction()
			//};
		//	return Basedao.exetcuIUD(sql, params);
		//}
		public static int mkorder(String orderno,String productid,int ordernum,Date deaddate,Date deliverdate,String rec_id,String address,String mobile) {
			//声明结果集
			ResultSet rs=null;
			int count =0;
			//获取连接对象
			Connection conn=Basedao.getconn();
			PreparedStatement ps=null;//预声明
			String sql="";
			try {
				sql = "{call pro_ord(?,?,?,?,?,?,?,?)}";
				ps=conn.prepareStatement(sql);
				ps.setString(1, orderno);
				ps.setString(2, productid);
				ps.setInt(3, ordernum);
				ps.setDate(4, deaddate);
				ps.setDate(5, deliverdate);
				ps.setString(6, address);
				ps.setString(7, mobile);
				rs=ps.executeQuery();
				count=ps.executeUpdate();
					
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				Basedao.closeall(rs, ps, conn);//记得关闭连接的资源
			}
			
			return count;
		}
			
			//return Basedao.exetcuIUD(sql, params);
			
			
			
			
			
		
		public static int choosetender(int tender_id) {
			ResultSet rs=null;
			int count =0;
			//获取连接对象
			Connection conn=Basedao.getconn();
			PreparedStatement ps=null;//预声明
			String sql="";
			try {
				sql="{call pro_tender(?)}";				ps=conn.prepareStatement(sql);
				ps.setInt(1, tender_id);
				rs=ps.executeQuery();
				count=ps.executeUpdate();
					
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				Basedao.closeall(rs, ps, conn);//记得关闭连接的资源
			}
			
			return count;
		}
		public static int managerenter(ManageRenter MR) {
			String sql="{call pro_mn(?,?,?,?)}";
			Object[] params= {
					MR.getDeviceid(),
					MR.getBegindate(),
					MR.getLength(),
					MR.getFactoryid()
					
			};
			return Basedao.exetcuIUD(sql, params);

			
		}
		private static int managermaintain(MnMaintainer MM) {
			String sql="{call pro_mt(?,?,?)}";
			Object[] params= {
					MM.getDeviceid(),
					MM.getProductid(),
					MM.getCapacity()
			};
			return Basedao.exetcuIUD(sql, params);

		}
		private static int manageschedule(ScheduleManager SM) {
			String sql="{call pro_pc(?,?,?,?)}";
			Object[] params= {
					SM.getTID(),
					SM.getTdeviceid(),
					SM.getTbegindate(),
					SM.getTenddate()
			};
			return Basedao.exetcuIUD(sql, params);

		}

}
