package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.News;
import com.ocean.service.NewsService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping(value = "/news")
public class NewsController {

	@Resource NewsService service;
	
	@RequestMapping(value = "/selectNews")
	@ResponseBody
	public JSONArray selectNews(/*@RequestParam(value="key") String key*/){
		String key = "有";
		List<News> news = service.selectNews(key);
		JSONArray json = JSONArray.fromObject(news); 
		System.out.println(json);
		return json;
	}
}
