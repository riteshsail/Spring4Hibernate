package com.pratice.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pratice.audit.Audit;

@Controller
public class MainController {

@Audit(value = "Home Page!!")
@RequestMapping(value="{user}/home.html")
public String getHomePage(@PathVariable("user") String name)
{
	System.out.println("User Name passed is " + name);
	return "home";
}

@Audit(value="Test Page")
@RequestMapping(value="/test.html")
public String getTestPage(@RequestParam("userSId") String userSId, HttpServletRequest request,HttpServletResponse response)
{
	System.out.println(">>>>TEST>>>>>"+userSId);
	return "test";
}
	


}
