package com.channels;

import com.interfaceO.Observer;

import java.util.ArrayList;

import com.interfaceO.ChannelMovement;

public class YouTubeChannel2 implements ChannelMovement {

	// Take one blank ArrayList of observer type to add user who are Observer as
	// well
	ArrayList<Observer> obList = null;

	// make default const and assign ArrayList
	public YouTubeChannel2() {
		this.obList = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer observer) {
		this.obList.add(observer);
	}

	@Override
	public void unregister(Observer observer) {
		int index = this.obList.indexOf(observer);
		if (index > 0) {
			this.obList.remove(index);
		}
	}

	@Override
	public void notifyObserver(String msg) {
		// please notify all user with new updates
		// steps bring all user, list me hmare user hai put for lopp

		for (Observer observer : this.obList) { // for each observer in obList send update method
			observer.update(msg);
		}
	}
	
	public void newVideoAdded(String msg) {
		notifyObserver(msg);
	}

}
