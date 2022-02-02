public final class ThreadLocal<T> {
    /*
    private ThreadLocal() {
    } // 객체 생성 불가

    public static class Key {
        Key() {}
    }
    */
   
    /*
    public static Key getKey(){
        return new Key();
    }
    */
    // public static void set(String key, Object value);
    // public static Object get(String key);

    public ThreadLocal();
    public void set(T value);
    public T get();
}
