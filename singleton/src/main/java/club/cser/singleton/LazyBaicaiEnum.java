package club.cser.singleton;
/*
 effective java 推荐的使用方式
 https://stackoverflow.com/questions/26285520/implementing-singleton-with-an-enum-in-java

 线程安全，在使用enum的时候才会加载，enum的默认构造器是private的，不用担心序列化的问题。

 序列化
 https://stackoverflow.com/questions/26285520/implementing-singleton-with-an-enum-in-java
 An enum type has no instances other than those defined by its enum constants. It is a compile-time error to attempt to explicitly instantiate an enum type. The final clone method in Enum ensures that enum constants can never be cloned, and the special treatment by the serialization mechanism ensures that duplicate instances are never created as a result of deserialization. Reflective instantiation of enum types is prohibited. Together, these four things ensure that no instances of an enum type exist beyond those defined by the enum constants.
*/

public enum LazyBaicaiEnum {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
