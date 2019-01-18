import java.util.*;
public class assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int n = in.nextInt();

		assert (n < 0): "MyOwnNegativeValueEnteredException" ;
		assert (n == 0): "MyOwnZeroValueEnteredException" ;
		
		for(int i=1;i<=n/2+1;i++)
		{
			for(int j=n/2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n/2;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n/2;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
