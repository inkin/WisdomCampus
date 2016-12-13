package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.NewsDao;
import com.ocean.model.News;

@Service 
public class NewsService {
	
	@Resource NewsDao dao;
	
	public List<News> selectNews(String key){
		return dao.selectNews(key);
	}
}
