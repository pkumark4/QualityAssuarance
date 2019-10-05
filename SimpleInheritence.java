package JavaInterface;

interface A
{ 
	int a=10; //by default variables in interface are static and final	
	void m1(); // abstract method, by default public 
}

public class SimpleInheritence implements A
{
	public void m1()  // we should mention public keyword explicitly as by default methods in class are 'default' which is less than public	
	{
			 System.out.println(a);		
	}
	
	public static void main(String[] args) 
	{
		/*SimpleInheritence t = new SimpleInheritence();
		t.m1(); */
		
		A a = new SimpleInheritence();
		a.m1();
    }
}