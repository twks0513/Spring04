package com.care.cookie_session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@RequestMapping("/popup")
	public String popup(@RequestParam(value = "nocook",required = false) String cookie,HttpServletRequest req,HttpServletResponse res) {		
		//Cookie[] cooks = req.getCookies();
		System.out.println(cookie);
		if(cookie != null) {
			System.out.println("체크됨");
		}else {
			System.out.println("안됨");
		}
		
		/*
		 * if(click == 0) { Cookie cook = new Cookie("myCookie", "test1");
		 * cook.setMaxAge(20); cook.setPath("/"); res.addCookie(cook); return "popup";
		 * }else{ Cookie cook = new Cookie("noCookie", "test2"); cook.setMaxAge(60);
		 * res.addCookie(cook); for(Cookie c : cooks) {
		 * if(c.getName().equals("mycookie")) { c.setMaxAge(0); res.addCookie(c); return
		 * "cookie"; } } }
		 */		
		return "popup";
	}
}
