package club.cser.singleton;

//每次获取都加锁，效率低
public class LazyBaicaiSyncMethod {
    private static LazyBaicaiSyncMethod instance;

    private LazyBaicaiSyncMethod() {

    }

    public static synchronized LazyBaicaiSyncMethod getInstance() {
        if (instance == null) {
            instance = new LazyBaicaiSyncMethod();
        }
        return instance;
    }
}
