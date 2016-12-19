package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ocean.model.Server;
import com.ocean.service.ServerService;

@Controller
@RequestMapping(value = "/server")
public class ServerController {
	@Resource ServerService service;
	
	@RequestMapping(value = "/selectServer")
	public void selectServer()
	{
		List<Server> servers = service.selectServer();
		System.out.println(servers);
	}
	
	@RequestMapping(value = "/addServer")
	public void addServer()
	{
		Server server = new Server();
		server.setServerAddress("学校正门");
		server.setServerId("04");
		server.setServerName("保安电话");
		server.setServerTell("44455566611");
		
		service.addServer(server);
	}
	
	@RequestMapping(value = "/updateServer")
	public void updateServer()
	{
		Server server = new Server();
		server.setServerAddress("学校南门");
		server.setServerId("04");
		//server.setServerName("门卫");
		server.setServerTell("4488888611");
		
		service.updateServer(server);
	}
	
	@RequestMapping(value = "/deleteServer")
	public void deleteServer()
	{
		String serverId = "03";
		service.deleteServer(serverId);
	}
}
