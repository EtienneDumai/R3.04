public class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton get_Instance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
