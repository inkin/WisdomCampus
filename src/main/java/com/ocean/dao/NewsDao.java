package com.ocean.dao;

import java.util.List;

import com.ocean.model.News;

public interface NewsDao {
	/**
	 * 查询新闻
	 * @param key
	 * @return
	 */
	List<News> selectNews(String key);
	
	/**
	 * 保存新闻
	 */
	void saveNews(News news);
	
	/**
	 * 发布新闻
	 */
	void publicNews();
	
	/**
	 * 删除新闻
	 */
	void removeNews();
}
