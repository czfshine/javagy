package czfshine.json.tojson;

import java.lang.reflect.Array;
import java.util.*;

public class Encoder {
	private int level = 0;
	public int MAXLEVEL = 100;

	private Writer writer;

	public Encoder() {
		level = 0;
		writer = new JsonWriter();
	}

	public <T> String tojson(T o) throws JsonLoop, BadObject {

		Start();

		// base type:
		if (o == null) {
			writer.add("null");
		} else if (o instanceof String) {
			writer.add(tostr((String) o));
		} else if (o instanceof Number) {
			writer.add(tostr((Number) o));
		} else if (o instanceof Arrays) {
			writer.add(tostr((Arrays) o));
		} else if (o instanceof Date) {
			writer.add(tostr((Date) o));
		} else if (o instanceof List) {
			writer.add(tostr((List<?>) o));
		} else if (o instanceof Queue) {
			writer.add(tostr((Queue<?>) o));
		} else if (o instanceof Set) {
			writer.add(tostr((Set<?>) o));
		} else if (o instanceof Vector) {
			writer.add(tostr((Vector<?>) o));
		} else if (o instanceof Character) {
			writer.add(tostr((Character) o));
		} else if (o instanceof Enum) {
			writer.add(tostr((Enum<?>) o));
		} else if (o instanceof StringBuffer) {
			writer.add(tostr((StringBuffer) o));
		}
		
		// array
		else if (o.getClass().isArray()) {
			arr(o);
		}
		// dict
		else if (o instanceof Map) {
			map((Map<?, ?>) o);
		}
		// other object
		else {
			obj(o);
		}
		return End();

	}

	private String tostr(StringBuffer o) {
		// TODO Auto-generated method stub
		return null;
	}

	private String tostr(Character o) {
		// TODO Auto-generated method stub
		return null;
	}

	private String tostr(Enum<?> o) {
		// TODO Auto-generated method stub
		return null;
	}

	private String tostr(Set<?> o) {
		// TODO Auto-generated method stub
		return null;
	}

	private String tostr(Queue<?> o) {
		// TODO Auto-generated method stub
		return null;
	}

	private String tostr(List<?> o) {
		// TODO Auto-generated method stub
		return null;
	}

	private String tostr(Date o) {
		// TODO Auto-generated method stub
		return null;
	}

	private String tostr(Arrays o) {
		// TODO Auto-generated method stub
		return null;
	}

	private <T> void tostr(T[] array) throws JsonLoop, BadObject {
		writer.beginArray();

		for (T v : array) {
			tojson(v);
			writer.sub();
		}
		writer.endArray();
	}

	private void Start() throws JsonLoop {
		// System.out.println(level);
		if (level == 0) {
			writer.Clean();
		}
		level++;

		if (level > MAXLEVEL) {
			throw new JsonLoop();
		}

	}

	private String End() {

		level--;
		if (level == 0) {
			return writer.getStr();
		} else {
			return "";
		}
	}

	private String tostr(String str) {
		return "\"" + str + "\"";
	}

	private String tostr(Number n) {
		return n.toString();
	}

	private Boolean CheckJsonable(Object o) {
		if (o instanceof jsonable) {
			writer.add(((jsonable) o).tojson());
			return true;
		} else {
			return false;
		}
	}

	private Boolean CheckID(Object o) {
		//TODO
		return true;
	}

	private void obj(Object o) throws BadObject {
		if (CheckJsonable(o) || CheckID(o)) {
			return;
		} else {
			throw new BadObject();
		}

	}

	private void arr(Object a) throws JsonLoop, BadObject {
		writer.beginArray();
		int length = Array.getLength(a);
		for (int j = 0; j < length; j++) {
			Object oo = Array.get(a, j);
			tojson(oo);
			writer.sub();
		}
		writer.endArray();
	}

	private <K, V> void map(Map<K, V> m) throws JsonLoop, BadObject {
		writer.beginObject();

		for (K k : (Set<K>) ((HashMap<K, V>) m).keySet()) {
			Object v = m.get(k);
			tojson(k);
			writer.k_v_sub();
			tojson(v);
			writer.sub();
		}

		writer.endObject();
	}

}
