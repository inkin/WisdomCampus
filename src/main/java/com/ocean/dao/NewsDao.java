package com.ocean.dao;

import java.util.List;

import com.ocean.model.News;
import com.ocean.pojo.SelectKey;

public interface NewsDao {
	/**
	 * 模糊查询消息(后台)
	 * 可以根据标题、时间、作者、类型来查找
	 * 要解决的问题：前端，后台，数据库时间格式的转换
	 * 前后台查看的消息不一样，前台只能看到已发布的消息，后台是所有
	 * @param key
	 * @return
	 */
	List<News> selectNews(SelectKey key);
	
	/**
	 * 消息模糊查询（前端）
	 * @param key
	 * @return
	 */
	List<News> selectNews02(SelectKey key);
	
	/**
	 * 保存消息
	 * 消息的出事状态都是就绪
	 * @param news
	 */
	void saveNews(News news);
	
	/**
	 * 修改消息
	 * 不能修改消息状态
	 * @param news
	 */
	void updateNews(News news);
	
	/**
	 * 发布消息
	 * 将消息状态改为发布
	 * @param newsId
	 */
	void publicNews(String newsId);
	
	/**
	 * 过期
	 * 将消息改为未发布状态
	 * @param newsId
	 */
	void unPublicNews(String newsId);
	
	/**
	 * 删除消息
	 * 在数据库中删掉该消息
	 * @param newsId
	 */
	void deleteNews(String newsId);
}
