package day6Array;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		
//		int a[] = new int[5];
//		a[0] = 10;
//		a[1] = 20;
//		a[2] = 30;
//		a[3] = 40;
//		a[4] = 50;
//		
		
		int a[] = {10,20,30,40,50};
		
		
//		int b = a.length; //size of the array
//		
//		System.out.println(b);
//		
//		System.out.println(a[0]);
//		
//		
//		for(int index=0;index<a.length;index++)
//		{
//			System.out.println(a[index]);
//		}
//		
		
		//enhanced for loop or for each loop
		
		for(int element:a)
		{
			System.out.println(element);
		}
		
	}

}
