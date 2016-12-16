package com.ocean.model;

/**
 * 消息实体类
 * 
 * @newsnewsAuthor Ocean
 *
 */
public class News {
	private String newsId;
	private String newsTitle;
	private String newsAuthor;
	private String newsDate;
	private String newsContent;
	private String newsAddress;
	private String newsTypeId;
	private String newsStatus;

	

	public News(String newsId, String newsTitle, String newsAuthor, String newsDate, String newsContent,
			String newsAddress, String newsTypeId, String newsStatus) {
		super();
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newsAuthor = newsAuthor;
		this.newsDate = newsDate;
		this.newsContent = newsContent;
		this.newsAddress = newsAddress;
		this.newsTypeId = newsTypeId;
		this.newsStatus = newsStatus;
	}
	
	

	public News(String newsId, String newsTitle, String newsAuthor, String newsDate, String newsContent,
			String newsAddress, String newsTypeId) {
		super();
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newsAuthor = newsAuthor;
		this.newsDate = newsDate;
		this.newsContent = newsContent;
		this.newsAddress = newsAddress;
		this.newsTypeId = newsTypeId;
	}



	public String getNewsStatus() {
		return newsStatus;
	}

	public void setNewsStatus(String newsStatus) {
		this.newsStatus = newsStatus;
	}

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

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getNewsAddress() {
		return newsAddress;
	}

	public void setNewsAddress(String newsAddress) {
		this.newsAddress = newsAddress;
	}

	public String getNewsTypeId() {
		return newsTypeId;
	}

	public void setNewsTypeId(String newsTypeId) {
		this.newsTypeId = newsTypeId;
	}

	public News() {

	}

}
