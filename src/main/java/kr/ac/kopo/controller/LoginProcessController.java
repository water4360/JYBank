package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
				
		request.setAttribute("msg", "로그인 성공!");
		
//		return "/jsp/login/loginProcess.jsp";
		
		//forward시키지 않고 send Redirect 하고 싶다면?
		//일단은 메인페이지로 가라.
		//근데 forward가 아니고 redirect:라는 키워드를 붙임.
		return "redirect:"+request.getContextPath();
//		return "redirect:/JYBanking"; 같은 것.
		
		
		
	}

}
