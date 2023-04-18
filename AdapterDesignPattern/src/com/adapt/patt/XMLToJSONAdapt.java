package com.adapt.patt;

import com.Interface.JSONData;
import com.Interface.OLDXMLData;

public class XMLToJSONAdapt implements JSONData {
	// y implements to JSONData becaz we want to convert to JSON

	OLDXMLData oldxmlData;

	// make const to setOLD XML TO oldxmlData

	public XMLToJSONAdapt(OLDXMLData oldxmlData) {
		this.oldxmlData = oldxmlData;
	}

	@Override
	public void readJSONData() {
		oldxmlData.readXMLData();
		System.out.println("Convert XML to JSON");

	}
}
