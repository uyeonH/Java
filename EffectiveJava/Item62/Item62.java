public final class ThreadLocal<T> {
    /*
    private ThreadLocal() {
    } // 객체 생성 불가

    public static class Key {
        Key() {}
    }
    */
    public ThreadLocal();    
    
    public static Key getKey(){
        return new Key();
    }
   // public static void set(String key, Object value);
    public  void set(T value);

   // public static Object get(String key);
    public  T get();

}
