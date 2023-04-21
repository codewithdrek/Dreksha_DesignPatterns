package com.tubelightOnOrOf;

import com.interfaceD.CommandD;
import com.tubelight.Tubelight;

public class TubelightOnCommand implements CommandD {

	Tubelight tubelight;

	public TubelightOnCommand(Tubelight tubelight) {
		this.tubelight = tubelight;
	}

	@Override
	public void execute() {
		tubelight.switchOn();
	}

}
