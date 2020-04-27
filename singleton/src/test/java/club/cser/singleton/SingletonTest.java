package club.cser.singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingletonTest {

    private static final Logger LOGGER = LogManager.getLogger(SingletonTest.class);

    @Test
    public void simpleTest() {

        // eagerly initialized singleton
        EagerBaicai eagerBaicai1 = EagerBaicai.getInstance();
        EagerBaicai eagerBaicai2 = EagerBaicai.getInstance();
        LOGGER.info("eagerBaicai1={}", eagerBaicai1);
        LOGGER.info("eagerBaicai2={}", eagerBaicai2);

        // lazily initialized singleton
        LazyBaicai lazyBaicai1 =
                LazyBaicai.getInstance();
        LazyBaicai lazyBaicai2 =
                LazyBaicai.getInstance();
        LOGGER.info("lazyBaicai1={}", lazyBaicai1);
        LOGGER.info("lazyBaicai2={}", lazyBaicai2);

        // double checked singleton
        LazyBaicaiDoubleCheck lazyBaicaiDoubleCheck1 = LazyBaicaiDoubleCheck.getInstance();
        LazyBaicaiDoubleCheck lazyBaicaiDoubleCheck2 = LazyBaicaiDoubleCheck.getInstance();
        LOGGER.info("lazyBaicaiDoubleCheck1={}", lazyBaicaiDoubleCheck1);
        LOGGER.info("lazyBaicaiDoubleCheck2={}", lazyBaicaiDoubleCheck2);

        // enum
        LazyBaicaiEnum lazyBaicaiEnum1 = LazyBaicaiEnum.INSTANCE;
        LazyBaicaiEnum lazyBaicaiEnum2 = LazyBaicaiEnum.INSTANCE;
        LOGGER.info("lazyBaicaiEnum1={}", lazyBaicaiEnum1);
        LOGGER.info("lazyBaicaiEnum2={}", lazyBaicaiEnum2);

        // inner static
        LazyBaicaiInnerStatic lazyBaicaiInnerStatic1 = LazyBaicaiInnerStatic.getInstance();
        LazyBaicaiInnerStatic lazyBaicaiInnerStatic2 = LazyBaicaiInnerStatic.getInstance();
        LOGGER.info("lazyBaicaiInnerStatic1={}", lazyBaicaiInnerStatic1);
        LOGGER.info("lazyBaicaiInnerStatic2={}", lazyBaicaiInnerStatic2);

        // sync method
        LazyBaicaiSyncMethod LazyBaicaiSyncMethod1 = LazyBaicaiSyncMethod.getInstance();
        LazyBaicaiSyncMethod LazyBaicaiSyncMethod2 = LazyBaicaiSyncMethod.getInstance();
        LOGGER.info("LazyBaicaiSyncMethod1={}", LazyBaicaiSyncMethod1);
        LOGGER.info("LazyBaicaiSyncMethod2={}", LazyBaicaiSyncMethod2);

    }



}
