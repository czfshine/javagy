package czfshine.lang.reflect.test;

import czfshine.json.tojson.Encoder;
import czfshine.lang.inline.inline;
import czfshine.lang.reflect.Find;

public class TestFinder {
	public static void main(String[] args){
		
		Find f=new Find();
		
		//f.has(new Encoder(), inline.class)
	
		f.getallatr(new Encoder());
	}
	
	
}
