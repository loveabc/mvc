package com.springmvc.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.spring.beans.JsonBean;
import com.spring.util.ImageEncoder;
import com.spring.util.SendHttp;

@Controller
public class FaceController {

	@RequestMapping(value = "/face", method = RequestMethod.POST)
	public ModelAndView face(MultipartFile img) {
		ModelAndView mav = null;
		try {
			byte[] bytes = img.getBytes();
			String base64Image = ImageEncoder.toBase64Image(bytes);
			SendHttp sendHttp = new SendHttp();
			String value = sendHttp.sendHttp(base64Image);
			JsonBean jsonBean = JSONObject.parseObject(value, JsonBean.class);
			mav = new ModelAndView();
			mav.addObject("jsonBean", jsonBean);
			mav.setViewName("face");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mav;

	}

	@RequestMapping(value = "/faceindex", method = RequestMethod.GET)
	public String index() {

		return "face";

	}

}
