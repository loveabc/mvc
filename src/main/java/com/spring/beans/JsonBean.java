package com.spring.beans;

import java.util.List;

/**
 * 
 * @author Administrator 证件识别返回json数据
 */
public class JsonBean {
	/** 被检测的图片在系统中的标识 */
	private String image_id;
	/** 用于区分每一次请求的唯一的字符串 */
	private String request_id;
	/** 返回的证件信息 */
	private List<IDCard> cards;
	/** 请求所花时间(毫秒) */
	private String time_use;

	public String getImage_id() {
		return image_id;
	}

	public void setImage_id(String image_id) {
		this.image_id = image_id;
	}

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public List<IDCard> getCards() {
		return cards;
	}

	public void setCards(List<IDCard> cards) {
		this.cards = cards;
	}

	public String getTime_use() {
		return time_use;
	}

	public void setTime_use(String time_use) {
		this.time_use = time_use;
	}

}
