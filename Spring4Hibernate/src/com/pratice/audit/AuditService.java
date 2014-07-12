package com.pratice.audit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class AuditService {

	
	public void audit(String name,HttpServletRequest request)
	{
		System.out.println("===============================================================");
		HttpSession session=request.getSession();
		
		System.out.println("Session userSID "+session.getAttribute("userSID"));
		System.out.println("The user accessed "+name+" page!!"+request.getRequestURI());
		System.out.println("Remote : "+request.getLocalAddr());
		System.out.println("Remote : "+request.getRemoteAddr());
		System.out.println("===============================================================");
	}
	
}
