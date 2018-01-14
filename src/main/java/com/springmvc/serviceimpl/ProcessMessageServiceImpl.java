package com.springmvc.serviceimpl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.spring.beans.Message;
import com.springmvc.service.ProcessMessageService;

@Service
public class ProcessMessageServiceImpl implements ProcessMessageService {

	public void toObject(String json) {
		Message mes = JSON.parseObject(json, Message.class);
		System.out.println(mes.getCommand());
	}

}
