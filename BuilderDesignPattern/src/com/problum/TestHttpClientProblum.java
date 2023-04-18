package com.problum;

public class TestHttpClientProblum {
public static void main(String[] args) {
	//get
HttpClientProblum httpClientProblum=	new HttpClientProblum("GET", "http://test.com", null, 
			null, null, null);
	//post
	new HttpClientProblum("POST", "http://test.com", null, 
			null, null, "POST BODY");
	
	
	System.out.println(httpClientProblum);
	//problum
//-ANY DEVlOPER NOT ABLE TO IDENTITY WHAT IS THIS NULL ,code is not readable
//hense builder pattern comes in 	
	//java 8 Defaukt y came
	//dEFAULT METHOD ME dEFAULT NEW DEFINE KAR DO NO DECLARATION ONLY DEFINING U SEE THOS DEFAULT NOT DISTURB EXESISTING CODE HENSE DEFAULT CAME IN PICTURE
}
}
