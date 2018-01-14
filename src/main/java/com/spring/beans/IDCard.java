package com.spring.beans;

/**
 * 
 * @author Administrator
 * 身份证信息
 */
public class IDCard {

	/**姓名*/
	private String name;
	/**性别*/
	private String gender;
	/**证件号码*/
	private String id_card_number;
	/**出生日期*/
	private String birthday;
	/**民族*/
	private String race;
	/**住址*/
	private String address;
	/**证件类型*/
	private String type;
	/**身份证正反面*/
	private String side;
	/**签发机关*/
	private String issued_by;
	/**有效日期*/
	private String valid_date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getId_card_number() {
		return id_card_number;
	}
	public void setId_card_number(String id_card_number) {
		this.id_card_number = id_card_number;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	public String getIssued_by() {
		return issued_by;
	}
	public void setIssued_by(String issued_by) {
		this.issued_by = issued_by;
	}
	public String getValid_date() {
		return valid_date;
	}
	public void setValid_date(String valid_date) {
		this.valid_date = valid_date;
	}
	@Override
	public String toString() {
		return "IDCard [name=" + name + ", gender=" + gender
				+ ", id_card_number=" + id_card_number + ", birthday="
				+ birthday + ", race=" + race + ", address=" + address
				+ ", type=" + type + ", side=" + side + ", issued_by="
				+ issued_by + ", valid_date=" + valid_date + "]";
	}
	
	
}
