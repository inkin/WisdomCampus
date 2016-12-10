package com.ocean.model;

/**
 * 服务实体类
 * 
 * @author Ocean
 *
 */
public class Server {
	private String serverId;      // 服务id
	private String serverAddress; // 服务地址
	private String serverTell;    // 服务电话

	public String getServerId() {
		return serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public String getServerAddress() {
		return serverAddress;
	}

	public void setServerAddress(String serverAddress) {
		this.serverAddress = serverAddress;
	}

	public String getServerTell() {
		return serverTell;
	}

	public void setServerTell(String serverTell) {
		this.serverTell = serverTell;
	}

	@Override
	public String toString() {
		return "Server [serverId=" + serverId + ", serverAddress=" + serverAddress + ", serverTell=" + serverTell + "]";
	}

	public Server(String serverId, String serverAddress, String serverTell) {
		this.serverId = serverId;
		this.serverAddress = serverAddress;
		this.serverTell = serverTell;
	}

	public Server() {

	}

}
