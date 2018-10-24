package regex;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please insert PESEL");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		Verify first = new Verify(input);
		System.out.print(first.getVerify());
		
		s.close();
	}

}
