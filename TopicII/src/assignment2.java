import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		try {
			String c=null;
			ArrayList<Number> data = new ArrayList<Number>();
			do {
				System.out.println("enter data only in Number Format");
				Number num = in.nextInt();
				data.add(num);
				System.out.println("do you want to add more numbers, yes for yes ,no for no");
				c = in.next();
				
			}while(c.equalsIgnoreCase("yes"));
			
		}
		catch(InputMismatchException e)
		{
			
			System.out.println("Enter only Integer or Float or Double");
		}

	}

}
