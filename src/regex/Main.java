package regex;





public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please insert PESEL\t");
		String try1 = "9822344234";
		Verify first = new Verify(try1);
		System.out.println(first.getVerify());
		System.out.println(first.size());
		
		
	}

}
