package com.Test;

import com.Facade.category.RoomLightSystem;
import com.Facade.category.SoundSystem;
import com.Facade.category.TelivisionSystem;
import com.homeTheatreFaced.HomeTheatreFacade;

public class Test {

	//main focus is hide method innovation calling itself
	//method innovation sequence also being encapsulated

	public static void main(String[] args) {
		
		RoomLightSystem roomLightSystem = new RoomLightSystem();
		SoundSystem soundSystem= new SoundSystem();
		TelivisionSystem telivisionSystem = new TelivisionSystem();
		
		HomeTheatreFacade facade = new HomeTheatreFacade(roomLightSystem, soundSystem, telivisionSystem);
	
	    facade.watchMovie();
	    System.out.println("------------------------");
	    facade.TurnOffMovie();
	    
	    //hense what faces does is called 2 methods , we dont ned to call Evey class methos individually 
	    //no need to call room,sound,telivion all faced is doig  for us 
	}
}


