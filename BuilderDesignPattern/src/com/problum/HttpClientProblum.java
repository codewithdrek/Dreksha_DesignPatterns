package com.problum;

public class HttpClientProblum {

	
	private String method;
	private String url;
	private String userName;
	private String password;
	private String header;
	private String body;
	public HttpClientProblum(String method, String uRL, String userName, String password, String header, String body) {
		super();
		this.method = method;
		this.url = uRL;
		this.userName = userName;
		this.password = password;
		this.header = header;
		this.body = body;
	}
	
	
	
}
