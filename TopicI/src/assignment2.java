
public class assignment2 {

	final void A1()
	{
		System.out.println("Finalize method called");
	}

}

class test{
	
	assignment2 obj = new assignment2();
	obj = new assignment2();
	obj = new assignment2();
	Runtime.getRuntime().gc(); 
	
}
}