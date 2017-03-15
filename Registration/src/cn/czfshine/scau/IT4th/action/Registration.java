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
		
		//TODO:用反射
		String team_name=new String(request.getParameter("team_name")+"");  
	    String master_name=new String(request.getParameter("master_name")+"");
	  
	     String master_id=new String(request.getParameter("master_id")+"");
	     
	     String master_college=new String(request.getParameter("master_college")+"");
	   
	     String master_level=new String(request.getParameter("master_level")+"");
	    
	     String master_phone=new String(request.getParameter("master_phone")+"");
	    
	     String master_email=new String(request.getParameter("master_email")+"");
	   
	     String master_major=new String(request.getParameter("master_major")+"");
	     
		
		Team T= new Team();
	
		T.setMaster_college(master_college) ;
		
		T.setMaster_email(master_email) ;
		
		T.setMaster_id( master_id) ;
		
		T.setMaster_level( master_level) ;
		
		T.setMaster_major(master_major) ;
		
		T.setMaster_name( master_name) ;
	
		T.setMaster_phone( master_phone) ;
		
		T.setTeam_name( team_name) ;
		
		

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
