package com.charles.util;

import java.io.File;

import org.sword.wechat4j.common.MediaFile;
import org.sword.wechat4j.common.MediaType;

public class MediaUtil {
	public static void main(String[] args) {
		MediaFile mediaFile = new MediaFile();   //创建示例对象
		
	    File file = new File("C:\\Users\\Administrator\\Desktop\\logo1.jpg");        //创建上传的文件
	    //上传文件，并且得到上传后的mediaId，微信支持的上传文件类型在MediaType中
	    String mediaId = mediaFile.upload(file,MediaType.image);
	    System.out.println(mediaId);
	}
	
}
