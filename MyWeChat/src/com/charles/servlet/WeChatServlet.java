package com.charles.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sword.wechat4j.param.SignatureParam;

import com.charles.support.MySupport;

public class WeChatServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
//		SignatureParam param = new SignatureParam(req);
//        String signature = param.getSignature();
//        String timestamp = param.getTimestamp();
//        String nonce = param.getNonce();
//        String echostr = param.getEchostr();
//        System.out.println("++++++"+signature+"______"+timestamp+"______"+nonce+"______"+echostr);
		
		
		MySupport mySupport = new MySupport(req);
		String result = mySupport.execute();
		resp.getOutputStream().write(result.getBytes());
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		MySupport mySupport = new MySupport(req);
		String result = mySupport.execute();
		resp.getOutputStream().write(result.getBytes());
	}
}
