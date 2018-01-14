package com.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message2 {

	private int id;
	private String command;
	private String content;

	private Map<String, String> map;
	private List<String> list;
	private Set<String> set;

	@XmlElement(name="kk")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement
	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	@XmlElement
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	@XmlElement
	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	@XmlElement
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}
	@XmlElement
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
