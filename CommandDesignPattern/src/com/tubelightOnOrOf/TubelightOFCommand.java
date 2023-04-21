package com.tubelightOnOrOf;

import com.interfaceD.CommandD;
import com.tubelight.Tubelight;

public class TubelightOFCommand implements CommandD {

	Tubelight tubelight;

	public TubelightOFCommand(Tubelight tubelight) {
		this.tubelight = tubelight;
	}

	@Override
	public void execute() {
		tubelight.switchOff();
	}

}
