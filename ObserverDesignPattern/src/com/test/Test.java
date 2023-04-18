package com.test;

import com.channels.YouTubeChannel1;
import com.channels.YouTubeChannel2;
import com.users.User1;
import com.users.User2;
import com.users.User3;

public class Test {

	public static void main(String[] args) {
		
		YouTubeChannel1 youTubeChannel1 = new YouTubeChannel1();
		YouTubeChannel2 youTubeChannel2 = new YouTubeChannel2();
		
		User1 u1 = new User1();
		User2 u2 = new User2();
		User3 u3 = new User3();
		
		youTubeChannel1.register(u1);
		youTubeChannel1.register(u2);
		
		
		youTubeChannel2.register(u1);
		youTubeChannel2.register(u2);
		youTubeChannel2.register(u3);
		
		youTubeChannel1.newVideoAdded("New Video added to Youtube 1");
		youTubeChannel2.newVideoAdded("New Video added to Youtube 2");
 	}
}
