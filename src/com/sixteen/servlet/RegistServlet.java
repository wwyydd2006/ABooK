package com.sixteen.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sixteen.DAO.IUserDAO;
import com.sixteen.DAO.impl.UserDAOImpl;
import com.sixteen.entity.User;

/**
 * Servlet implementation class RegistServlet
 */
public class RegistServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname = request.getParameter("uname");
		String upasswd = request.getParameter("upasswd");
		String upasswd_check = request.getParameter("upasswd_check");
		String unickname = request.getParameter("unickname");
		boolean flag = false;
		if (upasswd.equals(upasswd_check)) {
			IUserDAO userDAO = new UserDAOImpl();
			User newUser = new User();
			newUser.setUname(uname);
			newUser.setUpasswd(upasswd);
			newUser.setUnickname(unickname);
			flag = userDAO.save(newUser);
		}
	}

}
