package com.ocean.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ocean.model.Server;
import com.ocean.service.ServerService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
@RequestMapping(value = "/server")
public class ServerController {
	@Resource ServerService service;
	
	@RequestMapping(value = "/selectServer")
	@ResponseBody
	public JSONArray selectServer( @RequestBody JSONObject json)
	{
		String key = json.getString("key");
		List<Server> servers = service.selectServer(key);
		JSONArray jsonArray = JSONArray.fromObject(servers);
		
		return jsonArray;
	}
	
	@RequestMapping(value = "/addServer")
	@ResponseBody
	public JSONObject addServer(@RequestBody JSONObject json)
	{
		Server server = new Server();
		server.setServerId(json.getString("serverId"));
		server.setServerAddress(json.getString("serverAddress"));
		server.setServerName(json.getString("serverName"));
		server.setServerTell(json.getString("serverTell"));
		
		service.addServer(server);
		json.clear();
		json.put("result", "ok");
		return json;
	}
	
	@RequestMapping(value = "/updateServer")
	@ResponseBody
	public JSONObject updateServer(@RequestBody JSONObject json)
	{
		Server server = new Server();
		server.setServerId(json.getString("serverId"));
		server.setServerName(json.getString("serverName"));
		server.setServerTell(json.getString("serverTell"));
		server.setServerAddress(json.getString("serverAddress"));
		json.clear();
		
		service.updateServer(server);
		json.put("result", "ok");
		
		return json;
	}
	
	@RequestMapping(value = "/deleteServer")
	@ResponseBody
	public JSONObject deleteServer(@RequestBody JSONObject json)
	{
		String serverId = json.getString("newsId");
		service.deleteServer(serverId);
		json.put("result", "ok");
		
		return json;
	}
}
