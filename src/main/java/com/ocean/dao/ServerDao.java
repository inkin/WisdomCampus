package com.ocean.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ocean.model.Server;

@Repository
public interface ServerDao {
	
	/**
	 * 查询所有服务
	 * @return
	 */
	List<Server> selectServer();
	
	/**
	 * 添加服务
	 */
	void addServer(Server server);
	
	/**
	 * 修改服务
	 * @param server
	 */
	void updateServer(Server server);
	
	/**
	 * 删除服务
	 * @param serverId
	 */
	void deleteServer(String serverId);
}
