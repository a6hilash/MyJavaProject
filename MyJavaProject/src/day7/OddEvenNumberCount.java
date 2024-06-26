package day7;

public class OddEvenNumberCount {

	public static void main(String[] args) {
		int a[]= {10,12,15,17,18,20,25};
		
		int evenCount=0;
		int oddCount=0;
		
		for(int element:a)
		{
			if(element%2 ==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Number of even numbers " + evenCount);

		System.out.println("Number of odd numbers " + oddCount);
	}

}
