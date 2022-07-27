package com.care.cookie_session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CookieController {
	
	@GetMapping("cookie")
	public String myCookie(HttpServletResponse res, HttpServletRequest req, @CookieValue(value = "myCookie", required = false) Cookie cookie) {
					
		Cookie cook = new Cookie("myCookie", "test1");
		cook.setMaxAge(20);
		cook.setPath("/");
		res.addCookie(cook);	
		
		return "cookie";
	}
	
	   @GetMapping("cookie_quiz")
	   public String cookieQuiz(HttpServletResponse response, Model model,
	                  @CookieValue(value="myCookie", required = false)Cookie cook) {
	      if( cook == null) {
	         //cook = new Cookie("myCookie", "testCookie");
	         //cook.setMaxAge(5);
	         //response.addCookie(cook);
	      }else {
	         model.addAttribute("cook", cook.getValue());
	      }
	      return "cookie_quiz";
	   }
	   
	   @GetMapping("popup")
	   public String popup(){
	      
	      return "popup";
	   }
	   
	   @GetMapping("chk")
	   public String chk(HttpServletResponse rep) {
	      Cookie cook = new Cookie("myCookie", "testCookie");
	      cook.setMaxAge(5);
	      rep.addCookie(cook);
	      return "popup";
	   }
	   
	   @GetMapping("main")
	   public String main(HttpServletRequest req) {
		  HttpSession session = req.getSession();
		  session.setAttribute("id", "111");
		  session.setAttribute("pw", "222");
		  session.setAttribute("name", "홍길동");			  
		  return "main";
	   }
	   
	   @GetMapping("logout")
	   public String logout(HttpSession session) {
		   session.invalidate();
		   return "cookie_quiz";
	   }
	   

	
}
