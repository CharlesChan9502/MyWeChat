package com.charles.util;

import org.sword.wechat4j.csc.CustomerServicesManager;
import org.sword.wechat4j.exception.WeChatException;

public class CustomerUtil {
	private CustomerServicesManager csm = new CustomerServicesManager();
	public CustomerServicesManager getCsm() {
		return csm;
	}
	public void setCsm(CustomerServicesManager csm) {
		this.csm = csm;
	}
	public void gg(String kf_account,String nickname,String password) throws WeChatException {
		csm.kfAddAccount(kf_account, nickname, password);
	}
	public static void main(String[] args) throws WeChatException {
		//测试号没有此功能
		String kf_account="onlychen0215@gh_820d4de96d2e";
		String nickname="CDT";
		String password=null;
		CustomerUtil cu = new CustomerUtil();
		cu.gg(kf_account, nickname, password);
	}
}
