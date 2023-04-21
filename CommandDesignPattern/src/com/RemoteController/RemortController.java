package com.RemoteController;

import com.interfaceD.CommandD;

public class RemortController {

	CommandD commandD;

	public RemortController(CommandD commandD) {
		this.commandD = commandD;
	}

	public void setCommandD(CommandD commandD) {
		this.commandD = commandD;
	}
	
	public void pressButton() {
		commandD.execute();
	}
	
}
