package lab3;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class PeselVerifyer {
	private int verify;
	
	public PeselVerifyer(String Line) throws Exception   {
	Pattern p = Pattern.compile("(\\d{11})");
	Matcher m = p.matcher(Line);
	try {
	verify = Integer.parseInt(Line);
	if(!m.find() && 11 > verify && verify > 11) {
		System.out.print("wrong syntax");
	}
	}
	catch(Exception ex ) {
		throw new Exception();
		
	}
		
		
	
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.print("Please insert PESEL");
		Scanner s = new Scanner(System.in);
		String PESEL = s.nextLine();
		PeselVerifyer first = new PeselVerifyer(PESEL);
		System.out.print(first);
		s.close();
		

	}

}
