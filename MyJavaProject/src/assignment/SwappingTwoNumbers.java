package assignment;

public class SwappingTwoNumbers {

	public static void main(String[] args) 
	
	{
		int a = 18, b = 30;
//		int c = a;
//		a = b;
//		b = c;
//		System.out.println(("the value of a is : " )+ a + (" , the value of b is : " + b) );

		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(("the value of a is : " )+ a + (" , the value of b is : " + b) );
		
		
	}

}
