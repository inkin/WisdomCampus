package com.ocean.model;

import java.util.Date;

/**
 * 消息实体类
 * 
 * @author Ocean
 *
 */
public class News {
	private String newsId;
	private String newsTitle;
	private String author;
	private Date newsDate;
	private String newsContent;
	private String newsaddress;
	private String newsTypeId;

	public String getNewsId() {
		return newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getNewsaddress() {
		return newsaddress;
	}

	public void setNewsaddress(String newsaddress) {
		this.newsaddress = newsaddress;
	}

	public String getNewsTypeId() {
		return newsTypeId;
	}

	public void setNewsTypeId(String newsTypeId) {
		this.newsTypeId = newsTypeId;
	}

	@Override
	public String toString() {
		return "News []";
	}

	public News(String newsId, String newsTitle, String author, Date newsDate, String newsContent, String newsaddress,
			String newsTypeId) {
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.author = author;
		this.newsDate = newsDate;
		this.newsContent = newsContent;
		this.newsaddress = newsaddress;
		this.newsTypeId = newsTypeId;
	}

	public News() {

	}

}
