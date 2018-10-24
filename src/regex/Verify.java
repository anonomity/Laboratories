package regex;

import java.util.regex.Pattern;

public class Verify {
	
	private String verify;
	private int newL;
	private String PESEL;
	
	Verify(String Line)   {
	Pattern p = Pattern.compile("(\\d.){11}");
	/*Matcher m = p.matcher(Line);*/
	newL = Line.length();
	if( 11 > newL && newL > 11) {
		verify = "wrong input"; 
	}
	else {
		verify = PESEL;
	}
	}

	public String getVerify() {
		return verify;
		}


}
