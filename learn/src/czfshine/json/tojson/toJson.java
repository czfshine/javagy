package czfshine.json.tojson;

import com.google.gson.*;


public class toJson {
	public static void main(String[] args){
		Encoder en= new Encoder();
		try {
			Gson g =new Gson();
			int [] a={1,2};
			System.out.print(g.toJson(a));
			System.out.print(en.tojson("1"));
			System.out.print(en.tojson(1));
			System.out.print(en.tojson(en));
			int[] data={1,2,3,4,5};
			System.out.print(en.tojson(data));
		} catch (JsonLoop e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
