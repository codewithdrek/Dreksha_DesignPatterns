package com.homeTheatreFaced;

import com.Facade.category.RoomLightSystem;
import com.Facade.category.SoundSystem;
import com.Facade.category.TelivisionSystem;

public class HomeTheatreFacade {

	static RoomLightSystem roomLightSystem;
	static SoundSystem soundSystem;
	static TelivisionSystem telivisionSystem;

	// Make const
	public HomeTheatreFacade(RoomLightSystem roomLightSystem, SoundSystem soundSystem,
			TelivisionSystem telivisionSystem) {
		this.roomLightSystem = roomLightSystem;
		this.soundSystem = soundSystem;
		this.telivisionSystem = telivisionSystem;
	}

	// Everything is encapsulated
	public static void watchMovie() {
		soundSystem.switchOnSoundSystem();
		telivisionSystem.switchOnTv();
		roomLightSystem.lightDim();
	}

	public static void TurnOffMovie() {
		soundSystem.switchOffSoundSystem();
		telivisionSystem.switchOffTv();
		roomLightSystem.lightBright();
	}

}
