package czfshine.json.tojson;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.Spring;

public class Encoder {
	private int level = 0;
	public int MAXLEVEL = 100;

	public enum canjson {
		String, Number;
	};

	public Encoder() {
		level = 0;
	}

	public <T> String tojson(T o) throws JsonLoop {
		level++;
		if (level > MAXLEVEL) {
			throw new JsonLoop();
		}
		String re = "";
		if (level == 1) {
			re += "{";
		}

		// System.out.print(o.getClass());
		if (o instanceof String) {
			re += tostr((String) o);
		} else if (o instanceof Number) {
			re += (tostr((Number) o));
		} else if (o.getClass().isArray()) {
			re+=arrtostr(o);
		} else {
			re += (tostr(o));
		}
		
		if (level == 1) {
			re += "}";
		}
		level--;
		return re;
	}

	private String tostr(String str) {
		return "\"" + str + "\"";
	}

	private String tostr(Number n) {
		return n.toString();
	}

	private String arrtostr(Object a) throws JsonLoop {
		String re="";
		String[] res = null;
		
		int i = 0;
		int length = Array.getLength(a);
		res = new String[length];
		for (int j = 0; j < length; j++) {
			Object oo = Array.get(a, j);
			res[i++] = tojson(oo);
		}
		re += "[";
		for (String s : res) {
			re += s;
			re += ",";
		}
		re += "]";

		return re;
	}

	private String tostr(Object o) {
		return "\"" + o.toString() + "\"";
	}

}
