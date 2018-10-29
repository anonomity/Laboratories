package lab3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PeselVerifyer {
	private int verify;
	public static int newL;
	
	public PeselVerifyer(String Line)   {
	Pattern p = Pattern.compile("(\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d)");
	/*Matcher m = p.matcher(Line);*/
	newL = Line.length();
	if( 11 > newL && newL > 11) {
		System.out.print("wrong syntax");
	}
	else {
		r
	}
		

		
		
	
	}
	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.print("Please insert PESEL");
		Scanner s = new Scanner(System.in);
		String PESEL = s.nextLine();
		PeselVerifyer first = new PeselVerifyer(PESEL);
		System.out.println(first.toString());
		
		s.close();
		

	}

}
