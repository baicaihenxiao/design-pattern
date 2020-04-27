package club.cser.singleton;

//Eagerly initialized, 线程安全，对象不使用的话会浪费内存
public class EagerBaicai {
    private static EagerBaicai instance = new EagerBaicai();

    private EagerBaicai() {

    }

    public static EagerBaicai getInstance() {
        return instance;
    }
}
