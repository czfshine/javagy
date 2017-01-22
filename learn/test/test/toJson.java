package czfshine.json.tojson.test;

import java.util.HashMap;
import java.util.Map;

import czfshine.json.tojson.BadObject;
import czfshine.json.tojson.Encoder;
import czfshine.json.tojson.JsonLoop;


//Main run and test
public class toJson {
	static Encoder en= new Encoder();
	private static void p(Object o){
		
			try {
                System.out.println(o);
				System.out.println("the json"+en.tojson(o));
			} catch (JsonLoop | BadObject e) {
				// TODO Auto-generated catch block
				System.out.println(111);
				e.printStackTrace();
			}
	
	}
	public static void main(String[] args){
		System.out.println(111);
		//base type
		p(1);
		p(1.1);
		p("czfshine");
		p(null);
		p((short)1);
		p((byte)1);
		p((long)1);
		p('\ucccc');
		
		//array
		
		int[] a={1,2,3,4,5,6};
		p(a);
		
		int[][] a2={{1,2,3},{4,5,6},{7,8,9}};
		p(a2);
		
		String[] as={"I","am","a","coder"};
		p(as);
		
		//dict
		
		//pure
		Map<String,Integer> aaa=new HashMap<String,Integer>();
		aaa.put("czfshine",1);
		aaa.put("test", 2);
		
		p(aaa);
		
		//obj-v
		Map<String,Object> aov= new HashMap<String,Object>();
		
		aov.put("STRING", "str");
		aov.put("bool", true);
		aov.put("nil", null);
		aov.put("array", a2);

		Map<String,Object> ac=new HashMap<String,Object>();
		ac.put("str",1);
		aov.put("dict", ac);
		
		p(aov);
		
		//other object
		p(en);
		
		Jsonabletest JT =new Jsonabletest();
		p(JT);
		
		
		
	}
}
