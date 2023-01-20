package com.cloudy_factory.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Basedao {
	static {
		//��������
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getconn() {
		//�������Ӷ���
		Connection conn=null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/�밶��Ŀmysql228���ݿ�?useSSL=false&serverTimezone=UTC","root","123456");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	public static int exetcuIUD(String sql,Object[] params) {//��sql��䴦��
		int count =0;
		Connection connection=Basedao.getconn();
		//׼��sql���
		PreparedStatement ps=null;
		//
		try {
			ps=connection.prepareStatement(sql);//����sql���
			//�󶨲���
			
			for(int i=0;i<params.length;i++) {
				ps.setObject(i+1, params[i]);
			}
			count=ps.executeUpdate();//����countһ��ʼ���Ƿ��أ�����ҳ����תΪ�հ�ҳ
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Basedao.closeall(null, ps, connection);
		}
		return count;//����Ӱ�������
		
	}
	public static void closeall(ResultSet rs,PreparedStatement ps,Connection conn) {
		try {		
		if(rs!=null)
			rs.close();}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {if(ps!=null)
			ps.close();}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {if(conn!=null)//���Ӷ���Ϊ��
			conn.close();}
		catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
