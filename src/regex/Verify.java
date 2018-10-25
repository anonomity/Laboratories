package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verify {
	
	private String out;
	private int newL;
	
	private String Line1;
	
	Verify(String Line)   {
	this.Line1 = Line;
	String regex = "\\d{11}";
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(Line);
	boolean matches = m.matches();
	newL = Line.length();
	if( 11 > newL || newL > 11) {
		out = "wrong input"; 
	}
	else {
		out = Line;
		
	}
	}


	public String getVerify() {
		return(out);
		}
	public int size() {
		return(newL);
	}

}
