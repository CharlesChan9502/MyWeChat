package com.charles.util;

import org.sword.wechat4j.token.TokenProxy;

public class CommonUtil {
	public String getjsapi_ticket(){
		String jsapi_ticket = TokenProxy.jsApiTicket();
		return jsapi_ticket;
	}
	public static void main(String[] args) {
		//得到jsapi_ticket
		CommonUtil commonUtil = new CommonUtil();
		System.out.println(commonUtil.getjsapi_ticket());
	}
}
