package czfshine.json.tojson;

import czfshine.lang.inline.inline;

//加final才会被inline
//因为下面的方法是public的，不是private，不会主动加final
public final class JsonWriter extends Writer {
	private StringBuffer SB;

	public JsonWriter() {
		SB = new StringBuffer();
	}

	@inline
	@Override
	public void beginArray() {
		SB.append("[");

	}

	@inline
	@Override
	public void endArray() {
		SB.append("]");

	}

	@inline
	@Override
	public void beginObject() {
		SB.append("{");

	}

	@inline
	@Override
	public void endObject() {
		SB.append("}");

	}

	@inline
	@Override
	public void sub() {
		SB.append(",");

	}

	@inline
	@Override
	public void k_v_sub() {
		SB.append(":");

	}

	@inline
	@Override
	public void add(String s) {
		SB.append(s);
	}

	

}
