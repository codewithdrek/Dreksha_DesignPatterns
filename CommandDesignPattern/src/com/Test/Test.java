package com.Test;

import com.RemoteController.RemortController;
import com.tubelight.Tubelight;
import com.tubelightOnOrOf.TubelightOFCommand;
import com.tubelightOnOrOf.TubelightOnCommand;

public class Test {

	public static void main(String[] args) {
		
		Tubelight tubelight = new Tubelight();
		
		TubelightOnCommand tubelightOnCommand = new TubelightOnCommand(tubelight);
		RemortController remortControllerON = new RemortController(tubelightOnCommand);
		remortControllerON.pressButton();//swithon,excute apne aap call
		
		TubelightOFCommand tubelightOfCommand = new TubelightOFCommand(tubelight);
		RemortController remortControllerOF = new RemortController(tubelightOfCommand);
		remortControllerOF.pressButton();
	}
}
