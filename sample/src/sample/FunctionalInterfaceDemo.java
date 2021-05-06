package sample;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
    void singleAbstract();
    default void defaultMth1() {
    	System.out.println("Inside defaultMth1");
    }
    default void defaultMth2() {
    	System.out.println("Inside defaultMth2");
    }
}
