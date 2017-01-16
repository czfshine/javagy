package czfshine.json.tojson;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Encoder {
	private int level = 0;
	public int MAXLEVEL = 100;
	
	private Writer writer;
	public Encoder() {
		level = 0;
		writer = new JsonWriter();
	}

	public <T> String tojson(T o) throws JsonLoop {
		
		Start();
		
		//base type:
		if(o ==null){
			writer.add("null");
		}
		else if (o instanceof String) {
			writer.add(tostr((String) o));
		} 
		else if (o instanceof Number) {
			writer.add(tostr((Number) o));
		}
		//array
		else if (o.getClass().isArray()) {
			arr(o);
		} 
		//dict
		else if(o instanceof Map){
			map((Map<?,?>)o);
		}
		//other object
		else {
			writer.add(tostr(o));
		}
		return End();
		
	}
	
	private <T> void tostr(T[] array) throws JsonLoop{
		writer.beginArray();
		
		for(T v: array){
			tojson(v);
			writer.sub();
		}
		writer.endArray();
	}
	
	private void Start() throws JsonLoop{
		//System.out.println(level);
		if(level==0){
			writer.Clean();
		}
		level++;
				
		if (level > MAXLEVEL) {
			throw new JsonLoop();
		}
		
	}
	
	private String End(){
		
		level--;
		if(level==0){
			return writer.getStr();
		}else{
			return "";
		}
	}
	private String tostr(String str) {
		return "\"" + str + "\"";
	}

	private String tostr(Number n) {
		return n.toString();
	}

	private String tostr(Object o) {
		return "\"" + o.toString() + "\"";
	}
	
	
	private void arr(Object a) throws JsonLoop {
		writer.beginArray();
		int length = Array.getLength(a);
		for (int j = 0; j < length; j++) {
			Object oo = Array.get(a, j);
			tojson(oo);
			writer.sub();
		}
		writer.endArray();
	}
	
	private <K,V> void map(Map<K,V> m) throws JsonLoop{
		writer.beginObject();
		
		for(K k :(Set<K>)((HashMap<K, V>) m).keySet()){
			Object v=m.get(k);
			tojson(k);
			writer.k_v_sub();
			tojson(v);
			writer.sub();
		}
		
		writer.endObject();
	}
	

}
