package club.cser.simplefactory;

public class FruitFactory {
    public static Fruit creat(FruitEnum fruitEnum) {
        switch (fruitEnum) {
            case APPLE:
                return new Apple();
            case BANANA:
                return new Banana();
            case ORANGE:
                return new Orange();
            default:
                throw new IllegalArgumentException("No such fruit");
        }
    }
}
