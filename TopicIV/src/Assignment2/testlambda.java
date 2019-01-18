package Assignment2;

public abstract class testlambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test lambda = () -> { System.out.println("Hello lambda here"); };
		

	}

}

interface Test{
	void foo();
}
