package com.imooc.types;

/**
 * 
 * @author Administrator 身份证正反面
 */
public enum SideEnum {

	IDCARD("front", "人像面"), HATCARD("back", "国徽面");
	/** 证件类型代码 */
	private final String side;
	/** 证件类型名称 */
	private final String sideName;

	private SideEnum(String side, String sideName) {
		this.side = side;
		this.sideName = sideName;
	}

	public String getSide() {
		return side;
	}

	public String getSideName() {
		return sideName;
	}

}
