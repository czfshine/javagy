package czfshine.json.tojson.test;

import czfshine.json.tojson.jsonable;

public class Jsonabletest implements jsonable{

	@Override
	public String tojson() {
		
		return "I am a jsonable object :)";
	}

}
