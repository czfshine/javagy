package czfshine.json.tojson;

import java.lang.reflect.Array;
import java.util.*;

import czfshine.lang.inline.inline;

public class Encoder {
	private int level = 0;
	public int MAXLEVEL;

	private Writer writer;

	public Encoder() {
		level = 0;
		writer = new JsonWriter();
        MAXLEVEL = 100;
    }
	
	public Encoder(Writer writer) {
		level = 0;
		this.writer = writer;
        MAXLEVEL = 100;
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
			set((Set<?>) o);
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

	// 下面这些会自动被inline，不用考虑开销
	// 把他们当做宏吧= =!
	// 用到泛型的就不行，不管啦
	@inline
	private String format(String str) {

		// TODO : @#$%^^&
		return "\"" + str + "\"";
	}

	@inline
	private String tostr(StringBuffer o) {

		return format(o.toString());
	}

	@inline
	private String tostr(Character o) {

		// TODO:hex

		return format("\\u" + (int) o);
	}

	private <T extends Enum<T>> String tostr(Enum<T> o) {
		// TODO Auto-generated method stub

		return null;
	}

	private <T> void set(Set<T> o) throws JsonLoop, BadObject {

		writer.beginArray();
		for (T v : o) {
			tojson(v);
			writer.sub();
		}
		writer.endArray();
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

	@inline
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

	@inline
	private String End() {

		level--;
		if (level == 0) {
			return writer.getStr();
		} else {
			return "";
		}
	}

	@inline
	private String tostr(String str) {
		return "\"" + str + "\"";
	}

	@inline
	private String tostr(Number n) {
		return n.toString();
	}

	@inline
	private Boolean CheckJsonable(Object o) {
		if (o instanceof jsonable) {
			writer.add(((jsonable) o).tojson());
			return true;
		} else {
			return false;
		}
	}

	private Boolean CheckID(Object o) {
		// TODO
		return true;
	}

	private void obj(Object o) throws BadObject {
		if (!(CheckJsonable(o) || CheckID(o))) {
			throw new BadObject();
		}

	}

	@inline
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

		for (K k : m.keySet()) {
			Object v = m.get(k);
			tojson(k);
			writer.k_v_sub();
			tojson(v);
			writer.sub();
		}

		writer.endObject();
	}

}
