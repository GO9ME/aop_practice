package com.multi.aopPro.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAspectJAutoProxy
@Controller
public class TestController {
	@Autowired
	DAO dao;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/aoptest1")
	public String aoptest01() {
		UserVO vo = new UserVO();
//		dao.getUser(vo);
//		dao.getUserList(vo);
//		dao.addUser(vo);
//		dao.deleteUser(vo);
		
		dao.addUser(vo);
		dao.deleteUser(vo);
		dao.getUser(vo);
		dao.getUserList(vo);
		
		return "index";
	}
}
