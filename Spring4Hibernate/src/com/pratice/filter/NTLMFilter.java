package com.pratice.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jcifs.ntlmssp.Type3Message;


public class NTLMFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {/*

		
		HttpServletRequest httprequest = (HttpServletRequest) request;
        HttpServletResponse httpresponse = (HttpServletResponse) response;
        HttpSession session=httprequest.getSession();
        
        
        
        String username = (String)session.getAttribute("userSID");
        
        System.out.println("Inside Filter now "+username);		
        String useragent = httprequest.getHeader("user-agent");

        if(username==null || username.equals(""))
        {
        	
        	System.out.println("User Name is null");
            try{
            
            	String auth = httprequest.getHeader("Authorization");
            	if (auth == null)
                {
            		System.out.println("Auth is null");
            		 httpresponse.setHeader("WWW-Authenticate", "NTLM");
            		 httpresponse.setStatus(httpresponse.SC_UNAUTHORIZED);
            		 httpresponse.setContentLength(0) ;
            		 httpresponse.flushBuffer();
            		 return;
                }

            	if (auth.startsWith("NTLM "))
                {
            		System.out.println("auth starts with NTLM");
            		byte[] msg = new sun.misc.BASE64Decoder().decodeBuffer(auth.substring(5));
                    int off = 0, length, offset;
                    if (msg[8] == 1)
                    {
                      byte z = 0;
                      byte[] msg1 = {(byte)'N', (byte)'T', (byte)'L', (byte)'M', (byte)'S', (byte)'S', (byte)'P', z,(byte)2, z, z, z, z, z, z, z,(byte)40, z, z, z, (byte)1, (byte)130, z, z,z, (byte)2, (byte)2, (byte)2, z, z, z, z, z, z, z, z, z, z, z, z};
                      httpresponse.setHeader("WWW-Authenticate", "NTLM " + new sun.misc.BASE64Encoder().encodeBuffer(msg1));
                      httpresponse.setStatus(httpresponse.SC_UNAUTHORIZED);
                      httpresponse.setContentLength(0) ;
                      httpresponse.flushBuffer();
                      return;
                    }
                    else if (msg[8] == 3)
                    {
                        //Did Authentication Succeed? All this is always printed.

                        Type3Message type3 = new Type3Message(msg);
                    	session.setAttribute("userSID", type3.getUser()+type3.getDefaultPassword());
                    }
                }

            	
            }catch(Exception e){
            	e.printStackTrace();
            	System.out.println("Exception called ....");
            }

        }
		chain.doFilter(httprequest, httpresponse);
		

	*/}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}
