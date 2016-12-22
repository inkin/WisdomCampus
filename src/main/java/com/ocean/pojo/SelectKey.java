package com.ocean.pojo;

import org.springframework.stereotype.Component;

/**
 * 消息查询关键字集实体类
 * @author Administrator
 *
 */
@Component
public class SelectKey {
	private String newsTitle;
	private String newsAuthor;
	private String newsDate;
	private String newsTypeId;
	
	public SelectKey() 
	{
		
	}
	
	public SelectKey(String newsTitle, String newsAuthor, String newsDate, String newsTypeId) 
	{
		this.newsTitle = newsTitle;
		this.newsAuthor = newsAuthor;
		this.newsDate = newsDate;
		this.newsTypeId = newsTypeId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsAuthor() {
		return newsAuthor;
	}

	public void setNewsAuthor(String newsAuthor) {
		this.newsAuthor = newsAuthor;
	}

	public String getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}

	public String getNewsTypeId() {
		return newsTypeId;
	}

	public void setNewsTypeId(String newsTypeId) {
		this.newsTypeId = newsTypeId;
	}

	
}
