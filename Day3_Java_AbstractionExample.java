package JavaAdvanced;

public abstract class Java_AbstractionExample {

	   public abstract void start();	  
		
}


*****************************************************************************************


package JavaAdvanced;

public class Java_AbstractoinExample2 extends Java_AbstractionExample{

	@Override
	public void start() {
    System.out.println("bike methodC");
		
	}		

	public static void main(String args[]) {
		Java_AbstractoinExample2 b =new Java_AbstractoinExample2();
    	b.start();
    	
    }
	
}


