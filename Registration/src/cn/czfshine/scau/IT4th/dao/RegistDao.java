/**
 * 
 */
package cn.czfshine.scau.IT4th.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.NutDao;
import org.nutz.dao.impl.SimpleDataSource;

import cn.czfshine.scau.IT4th.dao.pojo.Team;

/**
 * @author czfshine
 *
 */
public class RegistDao {
	Dao dao ;
	public RegistDao(){
		
		// 创建一个数据源
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		SimpleDataSource dataSource = new SimpleDataSource();
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/registr");
		dataSource.setUsername("root");
		dataSource.setPassword("12345678");

		// 创建一个NutDao实例,在真实项目中, NutDao通常由ioc托管, 使用注入的方式获得.
		dao = new NutDao(dataSource);

		// 创建表
		dao.create(Team.class, false); // false的含义是,如果表已经存在,就不要删除重建了.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void AddTeam(Team T){
		dao.insert(T);
		
	}
}
