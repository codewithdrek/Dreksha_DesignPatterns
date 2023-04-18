package com.Test;

import com.ImplClass.OldXmlFormat;
import com.Interface.JSONData;
import com.adapt.patt.XMLToJSONAdapt;

public class Test {

	public static void main(String[] args) {
		//main focus is purani cheezo ke saath saath nai cheezo ko bhi adapt kar lijiye
		//purani cheezo ko hta nai sakte
		
		//french lan i dont know , but i know englishi and if i want to communicate then i have to adapt french
		//one more way is use translator
	
	    OldXmlFormat oldXmlFormat  = new OldXmlFormat();
	  //  JSONData jsonData  = //conct calling of Adapter class
	    JSONData jsonData  = new  XMLToJSONAdapt(oldXmlFormat);
	    //JSONData me receive karo
	    jsonData.readJSONData();//in this method xml to json code is written
	}
}
