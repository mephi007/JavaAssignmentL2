import java.time.*;
import java.util.*;
public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		LocalDate date1 = LocalDate.of(1997, Month.MARCH , 24);
		LocalDate date2 = LocalDate.of(2018, Month.MARCH, 24);
		
		Period diff = Period.between(date1, date2);
		
		System.out.println("\nDifference between "+ date1 +" and "+ date2 +": " 
			     + diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");


	}

}
