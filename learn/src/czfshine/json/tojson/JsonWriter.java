package czfshine.json.tojson;

public class JsonWriter extends Writer {
	private StringBuffer SB;
	
	public JsonWriter(){
		SB=new StringBuffer();
	}
	@Override
	public void beginArray() {
		SB.append("[");

	}

	@Override
	public void endArray() {
		SB.append("]");

	}

	@Override
	public void beginObject() {
		SB.append("{");

	}

	@Override
	public void endObject() {
		SB.append("}");

	}

	@Override
	public void sub() {
		SB.append(",");

	}

	@Override
	public void k_v_sub() {
		SB.append(":");
		
	}

	@Override
	public void add(String s) {
		SB.append(s);
	}
	
	public  String getStr(){
		return SB.toString();
		}
	@Override
	public void Clean() {
		//todo
		SB=null;
		SB=new StringBuffer();
		
	}

}
