package com.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.spring.beans.Message;
import com.springmvc.service.ProcessMessageService;

@Controller
public class ProcessMessageController {

	@Autowired
	private ProcessMessageService processMessageService;

	@RequestMapping("/index")
	public ModelAndView getIndex(ModelAndView mad) {
		System.out.println("...");
		mad.setViewName("index");
		mad.addObject("time", Long.toString(System.currentTimeMillis()));
		return mad;
	}

	// todo http://localhost:8080/springmvc/base?age=90
	@RequestMapping("/base")
	@ResponseBody
	public String base(int age) {
		System.out.println("base");
		if(age/90==1){
			throw new RuntimeException("test throw exception");
		}
		return Integer.toString(age);
	}

	// todo
	// http://localhost:8080/springmvc/array?names=Jim&names=Tom&names=Kitty
	@RequestMapping("/array")
	@ResponseBody
	public String array(String[] names) {
		StringBuilder builder = new StringBuilder();
		for (String name : names) {
			builder.append(name).append(" ");
		}
		return builder.toString();
	}

	@RequestMapping("/object")
	@ResponseBody
	public String object(Message obj) {
		return obj.toString();
	}

	// alibaba解析json的插件
	@RequestMapping("/json")
	@ResponseBody
	public String json(Message obj) {
		String json = JSON.toJSONString(obj);
		processMessageService.toObject(json);
		return json;
	}
	//restful param
	@RequestMapping("/restful/{nameaa}")
	@ResponseBody
	public String restfulParam(@PathVariable("nameaa") String name){
		return name;
	}
	//josn to object
	//xml to object
	//ajax
	@RequestMapping("/ajax")
	@ResponseBody
	public String ajax(Message msg){
		String json = JSON.toJSONString(msg);
		System.out.println(msg);
		return json;
	}
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String uploadFile(MultipartFile img) throws IOException{
		if(!img.isEmpty()){
			FileUtils.copyInputStreamToFile(img.getInputStream(), new File("E://"+img.getOriginalFilename()));
		}
		return "index";
	}
	@RequestMapping(value="/mulUpload", method=RequestMethod.POST)
	public String uploadFile(MultipartHttpServletRequest request) throws IOException{
		Iterator<String> it=request.getFileNames();
		while(it.hasNext()){
			String fileName=it.next();
			MultipartFile img=request.getFile(fileName);
			if(!img.isEmpty()){
				FileUtils.copyInputStreamToFile(img.getInputStream(), new File("E://"+img.getOriginalFilename()));
			}
		}
		
		return "index";
	}
	@RequestMapping("/around")
	@ResponseBody
	public String around(String name,int age) {
		return name+"  "+Integer.toString(age);
	}
}
