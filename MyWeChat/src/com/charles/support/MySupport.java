package com.charles.support;

import javax.servlet.http.HttpServletRequest;

import org.sword.wechat4j.WechatSupport;
import org.sword.wechat4j.message.CustomerMsg;

public class MySupport extends WechatSupport{

	public MySupport(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void click() {
		// TODO Auto-generated method stub
//		responseText("感谢你的赞");
		String openId = wechatRequest.getFromUserName();
		CustomerMsg customerMsg = new CustomerMsg(openId);
		//发送文本
		customerMsg.sendText("666666666"); 
	}

	@Override
	protected void location() {
		//用户同意获取地理位置
		System.out.println("您的纬度："+wechatRequest.getLatitude()+",/n经度："+wechatRequest.getLongitude()+",/n精度："+wechatRequest.getPrecision());
	}

	@Override
	protected void locationSelect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onLink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onLocation() {
		//用户发送位置触发
		responseText("您的纬度："+wechatRequest.getLocation_X()+",\n经度："+wechatRequest.getLocation_Y()+",\n地名："+wechatRequest.getLabel());
	}

	@Override
	protected void onText() {
		// TODO Auto-generated method stub
		responseText("hey man!");
		responseImage("G8XuGMlwfqJyivRJ5Viis6gLKxCNZ8PMv8Rv_9aIkB-T6GKotyP_ozyduYY6nNWB");
		responseText(wechatRequest.getContent());
	}

	@Override
	protected void onUnknown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onVoice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picPhotoOrAlbum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picSysPhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picWeixin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scan() {
		// TODO Auto-generated method stub
		System.out.println("您已关注查尔斯风号码："+wechatRequest.getTicket());
	}

	@Override
	protected void scanCodePush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scanCodeWaitMsg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void subscribe() {
		// TODO Auto-generated method stub
		responseText("欢迎关注查尔斯风测试号");
	}

	@Override
	protected void templateMsgCallback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void unSubscribe() {
		// TODO Auto-generated method stub
		System.out.println("再见！");
	}

	@Override
	protected void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void kfCloseSession() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void kfCreateSession() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void kfSwitchSession() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onShortVideo() {
		// TODO Auto-generated method stub
		
	}

}
