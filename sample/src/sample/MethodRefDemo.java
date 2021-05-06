package sample;

import java.util.function.*;
public class MethodRefDemo {

	public static void main(String[] args) {
		FunctionalInterfaceDemo demo = Test :: testImplementation;
		demo.singleAbstract();
	}
    static class Test{
    	public static void testImplementation() {
    		System.out.println("Inside testImplementation");
    	}
    }
}
