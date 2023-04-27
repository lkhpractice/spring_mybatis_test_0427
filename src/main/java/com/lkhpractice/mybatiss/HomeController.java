package com.lkhpractice.mybatiss;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	private SqlSession sqlSession;	// sqlSession 빈이 컨테이너에서 자동 주입
	
	@RequestMapping(value = "/list")
	public String list() {
		
		return "list";
	}
	
}
