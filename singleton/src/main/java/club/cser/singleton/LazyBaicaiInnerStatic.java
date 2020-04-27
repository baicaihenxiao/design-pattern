package club.cser.singleton;

// 外部类的静态块在程序启动时类加载器就会加载该类并执行静态块，但是静态内部类会在使用的时候才会被加载，同时也会保证线程安全。
public class LazyBaicaiInnerStatic {
    private static LazyBaicaiInnerStatic instance;

    private LazyBaicaiInnerStatic() {

    }

    public static LazyBaicaiInnerStatic getInstance() {
        return BaicaiHolder.instance;
    }

    private static class BaicaiHolder {
        private static LazyBaicaiInnerStatic instance = new LazyBaicaiInnerStatic();
    }
}
