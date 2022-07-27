package com.care.cookie_session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController {
	@GetMapping("makeSession")
	public String makeSession(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession();
		model.addAttribute("id","model");
		session.setAttribute("id","aaa");
		session.setAttribute("name", "홍길동");
		return "makeSession";
	}
	
	@GetMapping("resultSession")
	public String resultSession() {
		return "resultSession";
	}
	@GetMapping("delSession")
	public String delSession(HttpSession session) {
		session.removeAttribute("id");
		//session.invalidate();
		return "delSession";
	}
}
