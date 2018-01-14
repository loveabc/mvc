package com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Message {

	private int id;
	private String command;
	private String content;
	private Map<String,String> map;
	private List<String> list;
	private Set<String> set;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Map<String, String> getMap() {
		return map;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", command=" + command + ", content=" + content + "]";
	}
	
}
