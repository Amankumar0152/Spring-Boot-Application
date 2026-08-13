package com.cloud.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloud.demo.dao.BugRepo;
import com.cloud.demo.model.Bug;

@Controller
public class BugController
{
	@Autowired
	BugRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addBug")
	public String addBug(Bug bug)
	{
		repo.save(bug);
		return "home.jsp";
	}
	
}
