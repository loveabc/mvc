package com.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.beans.Message2;

@Controller
public class XmlController {

	@RequestMapping("/xml")
	@ResponseBody
	public Message2 toJson() {
		Message2 msg = new Message2();
		msg.setId(100);
		msg.setCommand("test command");
		msg.setContent("test content");
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "xx");
		map.put("age", "yy");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		Set<String> set = new HashSet<String>();
		set.add("mmmmmm");
		set.add("nnnnnnnnn");
		msg.setMap(map);
		msg.setList(list);
		msg.setSet(set);
		return msg;
	}
}
