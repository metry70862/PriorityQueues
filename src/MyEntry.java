public class MyEntry implements Entry{
    private Object key;
    private Object value;

    public MyEntry(Object k, Object v) {
        key = k;
        value = v;
    }

    public void setKey(Object k) {
        key = k;
    }

    public void setValue(Object v) {
        value = v;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
