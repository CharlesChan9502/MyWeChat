package com.charles.util;

import java.util.List;

import org.sword.wechat4j.user.UserManager;

public class UserUtil {
	UserManager userManager = new UserManager();
	public void test(){
		//获取所有的关注者列表
		List<String> userList = userManager.allSubscriber();
		int i = 0;
		for(String user:userList){
			i++;
			System.out.println("第"+i+"个用户openID："+user);
		}
		//多页的时候，调用subscriberList之后的nextOpenId，用于调用下一页
//		userManager.getNextOpenId();


		//获取nextOpenId开始的关注者列表前10000人
//		List<Object> userList = userManager.subscriberList(nextOpenId);


		//关注者总数,必须先调用一下subscriberList方法才能得到total
//		long userTotal = userManager.getTotal();

	}
	public static void main(String[] args) {
		UserUtil userUtil = new UserUtil();
		userUtil.test();
	}
}
