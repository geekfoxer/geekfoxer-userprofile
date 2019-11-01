package com.arch.log.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtils {
	
	private static String url;
	private static String user;
	private static String password;
	static{
		try {
			
			// 将具体参数存放配置文件中， xml，properties（key=value）
			// 1 加载 properties 文件 src （类路径） -->  WEB-INF/classes
			// 方式1： 使用类加载ClassLoader的方式加载资源
			InputStream is = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbcInfo-mysql.properties");
			// 2 解析
			Properties props = new Properties();
			props.load(is);
			
			// 3 获得配置文件中数据
			String driver = props.getProperty("driver");
			url = props.getProperty("url");
			user = props.getProperty("user");
			password = props.getProperty("password");;
			
			// 4 注册驱动
			Class.forName(driver);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * 获得连接
	 * @return
	 */
	public static Connection getConnection(){
		try {
			
			Connection conn = DriverManager.getConnection(url, user, password);
			return conn; //获得连接
		} catch (Exception e) {
			//将编译时异常 转换 运行时 ， 以后开发中 运行时异常使用比较多的。
			// * 此处可以编写自定义异常。
			throw new RuntimeException(e);
			// * 类与类之间 进行数据交换时，可以使用return返回值。也可以自定义异常返回值，调用者try{} catch(e){ e.getMessage() 获得需要的数据}
			//throw new MyConnectionException(e);
		}
	}
	
	/**
	 * 释放资源
	 * @param conn
	 * @param st
	 * @param rs
	 */
	public static void closeResource(Connection conn,Statement st,ResultSet rs){
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally{
			try {
				if (st != null) {
					st.close();
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally{
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}
