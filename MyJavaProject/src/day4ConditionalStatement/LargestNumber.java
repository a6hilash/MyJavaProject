package day4ConditionalStatement;

public class LargestNumber {

	public static void main(String[] args) {
		
//		int a=10000,b=1500,c=300;
//		if(a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("A is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//		}
//		else
//		{
//			if(b>c)
//			{
//				System.out.println("b is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//		}

		int a=120,b=115,c=30;
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if (b>a && b>c)
		{
			System.out.println("B is grater");
		}
		else
		{
			System.out.println("c is grater");
		}
		
	}

}
