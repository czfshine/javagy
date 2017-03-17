package cn.czfshine.scau.IT4th.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.czfshine.scau.IT4th.dao.RegistDao;
import cn.czfshine.scau.IT4th.dao.pojo.Team;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    /**
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}
	**/
	/**
	 * @see Servlet#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");

		
		RegistDao Dao=new RegistDao();
		
		//TODO:
		
	     String  team_name=new String(request.getParameter("team_name")+"");

	     String  master_name=new String(request.getParameter("master_name")+"");

	     String  master_id=new String(request.getParameter("master_id")+"");

	     String  master_level=new String(request.getParameter("master_level")+"");


	     String  master_college=new String(request.getParameter("master_college")+"");

	     String  master_major=new String(request.getParameter("master_major")+"");

	     String  master_phone=new String(request.getParameter("master_phone")+"");

	     String  master_qq=new String(request.getParameter("master_qq")+"");

	     String  master_email=new String(request.getParameter("master_email")+"");

	     String  user_count=new String(request.getParameter("user_count")+"");


	     String  user_name_0=new String(request.getParameter("user_name_0")+"");

	     String  user_id_0=new String(request.getParameter("user_id_0")+"");

	     String  user_level_0=new String(request.getParameter("user_level_0")+"");

	     String  user_collage_0=new String(request.getParameter("user_collage_0")+"");

	     String  user_major_0=new String(request.getParameter("user_major_0")+"");

	     String  user_phone_0=new String(request.getParameter("user_phone_0")+"");

	     String  user_role_0=new String(request.getParameter("user_role_0")+"");


	     String  user_name_1=new String(request.getParameter("user_name_1")+"");

	     String  user_id_1=new String(request.getParameter("user_id_1")+"");

	     String  user_level_1=new String(request.getParameter("user_level_1")+"");

	     String  user_collage_1=new String(request.getParameter("user_collage_1")+"");

	     String  user_major_1=new String(request.getParameter("user_major_1")+"");

	     String  user_phone_1=new String(request.getParameter("user_phone_1")+"");

	     String  user_role_1=new String(request.getParameter("user_role_1")+"");


	     String  user_name_2=new String(request.getParameter("user_name_2")+"");

	     String  user_id_2=new String(request.getParameter("user_id_2")+"");

	     String  user_level_2=new String(request.getParameter("user_level_2")+"");

	     String  user_collage_2=new String(request.getParameter("user_collage_2")+"");

	     String  user_major_2=new String(request.getParameter("user_major_2")+"");

	     String  user_phone_2=new String(request.getParameter("user_phone_2")+"");

	     String  user_role_2=new String(request.getParameter("user_role_2")+"");


	     String  user_name_3=new String(request.getParameter("user_name_3")+"");

	     String  user_id_3=new String(request.getParameter("user_id_3")+"");

	     String  user_level_3=new String(request.getParameter("user_level_3")+"");

	     String  user_collage_3=new String(request.getParameter("user_collage_3")+"");

	     String  user_major_3=new String(request.getParameter("user_major_3")+"");

	     String  user_phone_3=new String(request.getParameter("user_phone_3")+"");

	     String  user_role_3=new String(request.getParameter("user_role_3")+"");


	     String  user_name_4=new String(request.getParameter("user_name_4")+"");

	     String  user_id_4=new String(request.getParameter("user_id_4")+"");

	     String  user_level_4=new String(request.getParameter("user_level_4")+"");

	     String  user_collage_4=new String(request.getParameter("user_collage_4")+"");

	     String  user_major_4=new String(request.getParameter("user_major_4")+"");

	     String  user_phone_4=new String(request.getParameter("user_phone_4")+"");

	     String  user_role_4=new String(request.getParameter("user_role_4")+"");

	         
		
		Team T= new Team();
	
		T.setTeam_name(team_name);
		T.setMaster_name(master_name);
		T.setMaster_id(master_id);
		T.setMaster_level(master_level);
		T.setMaster_college(master_college);
		T.setMaster_major(master_major);
		T.setMaster_phone(master_phone);
		T.setMaster_qq(master_qq);
		T.setMaster_email(master_email);
		T.setUser_count(user_count);
		T.setUser_name_0(user_name_0);
		T.setUser_id_0(user_id_0);
		T.setUser_level_0(user_level_0);
		T.setUser_collage_0(user_collage_0);
		T.setUser_major_0(user_major_0);
		T.setUser_phone_0(user_phone_0);
		T.setUser_role_0(user_role_0);
		T.setUser_name_1(user_name_1);
		T.setUser_id_1(user_id_1);
		T.setUser_level_1(user_level_1);
		T.setUser_collage_1(user_collage_1);
		T.setUser_major_1(user_major_1);
		T.setUser_phone_1(user_phone_1);
		T.setUser_role_1(user_role_1);
		T.setUser_name_2(user_name_2);
		T.setUser_id_2(user_id_2);
		T.setUser_level_2(user_level_2);
		T.setUser_collage_2(user_collage_2);
		T.setUser_major_2(user_major_2);
		T.setUser_phone_2(user_phone_2);
		T.setUser_role_2(user_role_2);
		T.setUser_name_3(user_name_3);
		T.setUser_id_3(user_id_3);
		T.setUser_level_3(user_level_3);
		T.setUser_collage_3(user_collage_3);
		T.setUser_major_3(user_major_3);
		T.setUser_phone_3(user_phone_3);
		T.setUser_role_3(user_role_3);
		T.setUser_name_4(user_name_4);
		T.setUser_id_4(user_id_4);
		T.setUser_level_4(user_level_4);
		T.setUser_collage_4(user_collage_4);
		T.setUser_major_4(user_major_4);
		T.setUser_phone_4(user_phone_4);
		T.setUser_role_4(user_role_4);
		
		

	Dao.AddTeam(T);
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
