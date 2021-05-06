package sample;

public class ReturnInTryBlock {
	
	
	   public static int myMethod()
	   {
	       try {
	           
	            return 9;
	       }
	       finally {
	            //finally
	            //System.out.println("Inside Finally block");
	    	   return 10;
	       }
		
	  }
	  public static void main(String args[])
	  {
	       System.out.println(ReturnInTryBlock.myMethod());
	  }

}
