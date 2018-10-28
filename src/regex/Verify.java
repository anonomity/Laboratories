package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Verify {
	
	private String out;
	private int newL;
	private String Line1;
	
	Verify(String Line)   {
	this.Line1 = Line;
	String regex = "\\d{11}";
	Pattern p = Pattern.compile(regex);
	Matcher m = p.matcher(Line1);
	
	
	while(m.find()) {
		if(m.group().length() != 0) {
			System.out.println(m.group().trim());
		}
		System.out.print("Start index: " + m.start());
		System.out.println("End index: " + m.end());
	}
	
	
	}


	public String getVerify() {
		return(out);
		}
	public int size() {
		return(newL);
	}

}
