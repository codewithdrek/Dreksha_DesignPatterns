package com.builderPatternSolution;


public class HttpClient {

		public HttpClient(HttpClientBuilder httpClientBuilder) {
	     this.method=httpClientBuilder.method;
	     this.url=httpClientBuilder.url;
	     this.userName=httpClientBuilder.userName;
	     this.password=httpClientBuilder.password;
	     this.header=httpClientBuilder.header;
	     this.body=httpClientBuilder.body;
		     
		
		}

		private String method;
		private String url;
		private String userName;
		private String password;
		private String header;
		private String body;
		
		
		
@Override
		public String toString() {
			return "HttpClient [method=" + method + ", url=" + url + ", userName=" + userName + ", password=" + password
					+ ", header=" + header + ", body=" + body + "]";
		}



public String getMethod() {
			return method;
		}



		public void setMethod(String method) {
			this.method = method;
		}



		public String getUrl() {
			return url;
		}



		public void setUrl(String url) {
			this.url = url;
		}



		public String getUserName() {
			return userName;
		}



		public void setUserName(String userName) {
			this.userName = userName;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getHeader() {
			return header;
		}



		public void setHeader(String header) {
			this.header = header;
		}



		public String getBody() {
			return body;
		}



		public void setBody(String body) {
			this.body = body;
		}



public static class HttpClientBuilder{
	private String method;
	private String url;
	private String userName;
	private String password;
	private String header;
	private String body;
	
	
	public HttpClientBuilder method(String method) {
		this.method= method;
		return this;
	}
	
	public HttpClientBuilder url(String url) {
		this.url= url;
		return this;
	}
	
	public HttpClientBuilder userName(String un) {
		this.userName= un;
		return this;
	}
	
	public HttpClientBuilder password(String password) {
		this.password= password;
		return this;
	}
	
	public HttpClientBuilder header(String header) {
		this.header= header;
		return this;
	}
	
	public HttpClientBuilder body(String body) {
		this.body= body;
		return this;
	}
	
	public HttpClient buidClient() {
		return new HttpClient(this);
	}

    
}
}
