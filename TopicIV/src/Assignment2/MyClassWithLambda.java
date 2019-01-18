package Assignment2;

public class MyClassWithLambda  {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Sumit";
		WordCount res = (String st) -> {
										String[] arr = st.split(" ");
										int len= arr.length;
										return len;
										};
		
		int result = res.count(str);
		System.out.println(result);

	}

}
