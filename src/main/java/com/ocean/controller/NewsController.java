package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.News;
import com.ocean.pojo.SelectKey;
import com.ocean.service.NewsService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/news")
public class NewsController 
{

	@Resource NewsService service;
	
	/**
	 * 后台消息查找
	 * @return
	 */
	@RequestMapping(value = "/selectNews")
	@ResponseBody
	public JSONArray selectNews(@RequestBody JSONObject json)
	{
		SelectKey key = new SelectKey();
		key.setNewsAuthor(json.getString("newsAuthor"));
		key.setNewsDate(json.getString("newsDate"));
		key.setNewsTitle(json.getString("newsTitle"));
		key.setNewsTypeId(json.getString("newsTypeId"));
		List<News> news = service.selectNews(key);
		JSONArray jsonArray = JSONArray.fromObject(news); 
		return jsonArray;
	}
	
	/**
	 * 前端消息查询
	 * @return
	 */
	@RequestMapping(value = "/selectNews02")
	@ResponseBody
	public JSONArray selectNews02(@RequestBody JSONObject json)
	{
		SelectKey key = new SelectKey();
		key.setNewsAuthor(json.getString("newsAuthor"));
		key.setNewsDate(json.getString("newsDate"));
		key.setNewsTitle(json.getString("newsTitle"));
		key.setNewsTypeId(json.getString("newsTypeId"));
		List<News> news = service.selectNews02(key);
		JSONArray jsonArray = JSONArray.fromObject(news);
		
		return jsonArray;
	}
	
	/**
	 * 消息保存
	 */
	@RequestMapping(value = "/saveNews")
	@ResponseBody
	public JSONObject saveNews(@RequestBody JSONObject json)
	{
		String newsTitle = json.getString("newsTitle");
		String newsAuthor = json.getString("newsAuthor");
		String newsContent = json.getString("newsContent");
		String newsDate = json.getString("newsDate");
		String newsTypeId = json.getString("newsTypeId");
		json.clear();
		
		//问题，主键自增。
		News news = new News("09",newsTitle, newsAuthor, newsDate, newsContent, newsTypeId);
		service.saveNews(news);
		//保存不成功怎么办？
		json.put("reslut", "success");
		
		return json;
	}
	
	@RequestMapping(value = "/updateNews")
	@ResponseBody
	public JSONObject updateNews(@RequestBody JSONObject json)
	{
		String newsId = json.getString("newsId");
		String newsTitle = json.getString("newsTitle");
		String newsAuthor = json.getString("newsAuthor");
		String newsContent = json.getString("newsContent");
		String newsDate = json.getString("newsDate");
		String newsTypeId = json.getString("newsTypeId");
		
		News news = new News(newsId, newsTitle, newsAuthor, newsDate, newsContent, newsTypeId);
		service.updateNews(news);
		json.clear(); 
		json.put("reslut", "ok");
		
		return json;
	}
	
	/**
	 * 消息发布
	 * @return
	 */
	@RequestMapping(value = "/publicNews")
	@ResponseBody
	public JSONObject publicNews(@RequestBody JSONObject json)
	{
		String newsId = json.getString("newsId");
		json.clear();
		service.publicNews(newsId);
		
		json.put("result", "success");
		return json;
	}
	
	@RequestMapping(value = "/unPublicNews")
	@ResponseBody
	public JSONObject unPublicNews(@RequestBody JSONObject json)
	{
		String newsId = json.getString("newsId");
		json.clear();
		service.unPublicNews(newsId);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/deleteNews")
	@ResponseBody
	public JSONObject deleteNews(@RequestBody JSONObject json){
		String newsId = json.getString("newsId");
		json.clear();
		
		service.deleteNews(newsId);
		//没有的newsId也会返回成功，这里有点问题。
		
		json.put("result", "ok");
		
		return json;
	}
}
