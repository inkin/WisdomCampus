package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.News;
import com.ocean.service.NewsService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/news")
public class NewsController {

	@Resource NewsService service;
	
	/**
	 * 新闻查找
	 * @return
	 */
	@RequestMapping(value = "/selectNews")
	@ResponseBody
	public JSONArray selectNews(/*@RequestParam(value="key") String key*/){
		String key = "有";
		List<News> news = service.selectNews(key);
		JSONArray json = JSONArray.fromObject(news); 
		System.out.println(json);
		return json;
	}
	
	/**
	 * 新闻保存
	 */
	@RequestMapping(value = "/saveNews")
	@ResponseBody
	public /*JSONObject*/void saveNews(/*@RequestBody JSONObject json*/){
		/*String newsTitle = json.getString("newsTitle");
		String newsAuthor = json.getString("newsAuthor");
		String newsContent = json.getString("newsContent");
		String newsDate = json.getString("newsDate");
		String newsAddress = json.getString("newsAddress");
		String newsTypeId = json.getString("newsTypeId");
		json.clear();*/
		
		String newsTitle = "2016-12-16";
		String newsAuthor = "Ocean";
		String newsContent = "天气很冷，要注意保暖。天空飘来五个字，那都不是事，是事也就烦一会";
		String newsDate = "2016-12-16";
		String newsAddress = "广州越秀淘金路";
		String newsTypeId = "01";
		String newsId = "002";
		String newsStatus = "000";
		
		News news = new News(newsId, newsTitle, newsAuthor, newsDate, newsContent, newsAddress, newsTypeId,newsStatus);
		service.saveNews(news);
		//保存不成功怎么办？
		/*json.put("reslut", "success");
		
		return json;*/
	}
	
	@RequestMapping(value = "/updateNews")
	@ResponseBody
	public /*JSONObject*/void updateNews(/*@RequestBody JSONObject json*/){
		/*String newsId = json.getString("newsId");
		String newsTitle = json.getString("newsTitle");
		String newsAuthor = json.getString("newsAuthor");
		String newsContent = json.getString("newsContent");
		String newsDate = json.getString("newsDate");
		String newsAddress = json.getString("newsAddress");
		String newsTypeId = json.getString("newsTypeId");*/
		
		String newsTitle = "一辈子暖暖就好";
		String newsAuthor = "Ocean";
		String newsContent = "我永远爱你到老";
		String newsDate = "2016-12-16";
		String newsAddress = "广州越秀淘金路";
		String newsTypeId = "01";
		String newsId = "002";
		
		News news = new News(newsId, newsTitle, newsAuthor, newsDate, newsContent, newsAddress, newsTypeId);
		service.updateNews(news);
		/*json.clear(); 
		
		return json;*/
	}
	
	/**
	 * 新闻发布
	 * @return
	 */
	@RequestMapping(value = "/publicNews")
	@ResponseBody
	public /*JSONObject*/void publicNews(/*@RequestBody JSONObject json*/){
		/*String newsId = json.getString("newsId");*/
		String newsId = "0001";
		service.publicNews(newsId);
		
		/*//json.put("result", "success");
		return json;*/
	}
}
