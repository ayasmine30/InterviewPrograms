package sample;

public class Singleton {
	private static Singleton obj= null;
	private Singleton() {
		
	}
	public static Singleton getObject() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		Singleton obj1=Singleton.getObject();
		Singleton obj2=Singleton.getObject();
		Singleton obj3=Singleton.getObject();
		
		System.out.println(obj1 == obj2);
		System.out.println(obj2 == obj3);
	}

}
