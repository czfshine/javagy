package czfshine.json.tojson;

public abstract class Writer {
@SuppressWarnings("unused")
private StringBuffer SB;

public abstract void beginArray();
public abstract void endArray();

public abstract void beginObject();
public abstract void endObject();

public abstract void sub();
public abstract void k_v_sub();

public abstract void add(String s);
public abstract void Clean();
public abstract String getStr();

}
