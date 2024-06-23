package assignment;

public class StudentName {

	public static void main(String[] args) {
		int mark = 12; // mark limit is 50
		
		if (mark>=25 && mark<=35)
		{
			System.out.println("Grade C");
		}
		else if (mark>=35 && mark<=45)
			
		{
			System.out.println("Grade B");
		}
		else if (mark>=45 && mark<=50)
		{
			System.out.println("Grade A");
		}
		else if (mark <= 20)
		{
			System.out.println("Grade F");
		}

	}

}
