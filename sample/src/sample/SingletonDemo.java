package sample;

public class SingletonDemo {

		private static SingletonDemo obj=null;
		
		private SingletonDemo() {
			
		}
		
		public static SingletonDemo getObj() {
			if(obj == null) {
				obj= new SingletonDemo();
			}
			return obj;
			
		}

	

}
