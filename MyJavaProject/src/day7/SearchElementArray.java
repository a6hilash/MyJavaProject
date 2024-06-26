package day7;

import java.util.Scanner;

public class SearchElementArray {

	public static void main(String[] args) {
		
		int arr[] = {10,40,50,30,20};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search");
		
		int i;
		int searchNum = sc.nextInt();
		
		for(i=0;i<arr.length;i++)
		{
			if(searchNum == arr[i])
			{
				System.out.println("the number is available");
				break;
			}
		}
		if(i == arr.length) 
		
		{
			System.out.println("not found");
		}

	}

}
