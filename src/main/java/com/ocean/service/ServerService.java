package com.ocean.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ocean.dao.ServerDao;
import com.ocean.model.Server;

@Service
public class ServerService
{
	
	@Resource ServerDao dao;
	
	public List<Server> selectServer(String key)
	{
		return dao.selectServer(key);
	}
	
	public void addServer(Server server)
	{
		dao.addServer(server);
	}
	
	public void updateServer(Server server)
	{
		dao.updateServer(server);
	}
	
	public void deleteServer(String serverId)
	{
		dao.deleteServer(serverId);
	}
}
