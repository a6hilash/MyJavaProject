package day7;

public class NumberCountingArray {

	public static void main(String[] args) {
		int a[] = {50,20,30,50,40,50,36,50};
		
		int num= 50;
		int count = 0;
		
		for(int element:a)
		{
			if(num == element)
			{
				count++;
			}
		}
		
		if(count !=0)
		{
			System.out.println("number found " + count + " times");
		}
		
		else
		{
			System.out.println("not found");
		}

	}

}
