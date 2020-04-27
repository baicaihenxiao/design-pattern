package club.cser.singleton;

//lazy loading, 线程不安全
public class LazyBaicai {

    private static LazyBaicai instance;

    private LazyBaicai() {

    }

    public static LazyBaicai getInstance() {
        if (instance == null) {
            instance = new LazyBaicai();
        }
        return instance;
    }
}
