package club.cser.simplefactory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class FactoryTest {

    private static final Logger LOGGER = LogManager.getLogger(FactoryTest.class);

    @Test
    public void factory() {
        Fruit f1 = FruitFactory.creat(FruitEnum.BANANA);
        f1.eat();
        Fruit f2 = FruitFactory.creat(FruitEnum.ORANGE);
        f2.eat();
        Fruit f3 = FruitFactory.creat(FruitEnum.APPLE);
        f3.eat();
    }

}
