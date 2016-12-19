package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.NewsDao;
import com.ocean.model.News;
import com.ocean.pojo.SelectKey;

@Service 
public class NewsService {
	
	@Resource NewsDao dao;
	
	//后台
	public List<News> selectNews(SelectKey key)
	{
		return dao.selectNews(key);
	}
	
	//前端
	public List<News> selectNews02(SelectKey key)
	{
		return dao.selectNews02(key);
	}
	
	public void saveNews(News news)
	{
		dao.saveNews(news);
	}
	
	public void updateNews(News news)
	{
		dao.updateNews(news);
	}
	
	public void publicNews(String newsId)
	{
		dao.publicNews(newsId);
	}
	
	public void unPublicNews(String newsId)
	{
		dao.unPublicNews(newsId);
	}
	
	public void deleteNews(String newsId)
	{
		dao.deleteNews(newsId);
	}
}
