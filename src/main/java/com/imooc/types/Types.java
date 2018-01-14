package com.imooc.types;

/**
 * 
 * @author Administrator 各个类型
 */
public class Types {

	/**
	 * 
	 * @param typeCode
	 * @return
	 * @throws Exception
	 *             获取证件类型中文
	 */
	public static final String getCardName(String typeCode) throws Exception {
		if ("1".equals(typeCode)) {
			return "身份证";
		}
		if ("2".equals(typeCode)) {
			return "港澳台通行证";
		}
		throw new Exception("没有找到该代码的证件类型" + typeCode);
	}

	/**
	 * 
	 * @param side
	 * @return 获取证件的正反面
	 */
	public static final String getSideName(String side) throws Exception {
		if ("front".equals(side)) {
			return "人像面";
		}
		if ("back".equals(side)) {
			return "国徽面";
		}
		throw new Exception("没有找到该代码的证件正反面" + side);
	}

}
