package com.builderPatternSolution;

public class TestSolution {
	public static void main(String[] args) {
	//HttpClientBuilder clientBuilder	= new HttpClient.HttpClientBuilder();
	
		HttpClient httpClient	= new HttpClient.HttpClientBuilder().method("POST")
				.url("http://test.com").userName("Dreksha").password("ZAQ!XSW@").body("").buidClient();
		
		System.out.println(httpClient);//output is something readable
	}

}
