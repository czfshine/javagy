/**
 * 
 */
package cn.czfshine.scau.IT4th.dao;

import java.util.Map;

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
		
		// 鍒涘缓涓�涓暟鎹簮
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Map<String, String> map = System.getenv();
		System.out.println(map);
		String mypw=map.getOrDefault("MYSQLPASSWORD", "963852741");
		String myservice=map.getOrDefault("MYSQLSERVICE", "czfshine.cn");
		String myuser=map.getOrDefault("MYSQLUSERNAME", "czf");
		SimpleDataSource dataSource = new SimpleDataSource();
		dataSource.setJdbcUrl("jdbc:mysql://"+myservice+":3306/registr");
		dataSource.setUsername(myuser);
		dataSource.setPassword(mypw);

		// 鍒涘缓涓�涓狽utDao瀹炰緥,鍦ㄧ湡瀹為」鐩腑, NutDao閫氬父鐢眎oc鎵樼, 浣跨敤娉ㄥ叆鐨勬柟寮忚幏寰�.
		dao = new NutDao(dataSource);

		// 鍒涘缓琛�
		dao.create(Team.class, false); // false鐨勫惈涔夋槸,濡傛灉琛ㄥ凡缁忓瓨鍦�,灏变笉瑕佸垹闄ら噸寤轰簡.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void AddTeam(Team T){
		dao.insert(T);
		
	}
}
