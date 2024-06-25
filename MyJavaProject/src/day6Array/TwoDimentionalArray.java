package day6Array;

public class TwoDimentionalArray {

	public static void main(String[] args) {
//		int a[][] = new int[3][2];
//		a[0][0] = 10;
//		a[0][1] = 20;
//		a[1][0] = 30;
//		a[1][1] = 40;
//		a[2][0] = 50;
//		a[2][2] = 60;
		
		
		int a[][] = { {10,20},{30,40},{50,60} };
		
//		System.out.println("number of rows:" + a.length);
//		System.out.println("number of colums:" + a[0].length);
//		System.out.println(a[0][1]);
		
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<2;col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
}
