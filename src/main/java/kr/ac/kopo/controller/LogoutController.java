package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutController implements Controller {
	
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
//		System.out.println("LogoutController handleRequest() 호출!");
		
		//forwrd 할 것임
		//forward에서의 /는? 플젝명 뒤.
		return "/jsp/login/logout.jsp";
	}

}
