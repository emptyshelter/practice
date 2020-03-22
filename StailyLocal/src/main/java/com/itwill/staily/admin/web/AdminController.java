package com.itwill.staily.admin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping(value = "admin_main")
	public String admin_main()throws Exception{
		
		return "forward:/WEB-INF/views/admin/index.html";
	}
}
