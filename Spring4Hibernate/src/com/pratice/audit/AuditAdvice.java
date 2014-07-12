package com.pratice.audit;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class AuditAdvice {
	
	@Autowired
	private AuditService auditService;

	@Autowired
	private HttpServletRequest request;
	
	@After("execution(public String com.pratice.controller.*Controller.*(..)) && @annotation(auditAnnotation)")
	public void myBeforeLogger(Audit auditAnnotation)
	{
		auditService.audit(auditAnnotation.value(),request);
	}
	
}