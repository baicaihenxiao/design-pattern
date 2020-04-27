package club.cser.singleton;


/*
为什么用volatile?
防止指令重排导致返回未初始化完全的对象

为什么用变量result?
Effective Java 3rd Edition, Item83: Use lazy initialization judiciously
In particular, the need for the local variable (result) may be unclear. What this variable does is to ensure that field is read only once in the common case where it’s already initialized. While not strictly necessary, this may improve performance and is more elegant by the stan- dards applied to low-level concurrent programming. On my machine, the method above is about 1.4 times as fast as the obvious version without a local variable.
 */
public class LazyBaicaiDoubleCheck {
    private static volatile LazyBaicaiDoubleCheck instance;

    private LazyBaicaiDoubleCheck() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static LazyBaicaiDoubleCheck getInstance() {
        LazyBaicaiDoubleCheck result = instance;
        if (result == null) {
            synchronized (LazyBaicaiDoubleCheck.class) {
                if (result == null) {
                    instance = result = new LazyBaicaiDoubleCheck();
                }
            }
        }
        return result;
    }
}
