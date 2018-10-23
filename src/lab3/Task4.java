package lab3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
	
	private int dayMonth;
	private int year;
	
	public Task4(String line) throws Exception {
		Pattern pat = Pattern.compile("(\\d{2}\\/){2}(\\d{4})");
		Matcher m= pat.matcher(line);
		if(!m.find()) {
			throw new Exception();
		}
		try {
			String field=m.group(1);
			dayMonth=Integer.parseInt(field);
			field=m.group(2);
			year =Integer.parseInt(field);
		} catch (Exception ex) {
			throw new Exception();
		}
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Task4 c= new Task4("223");
		System.out.println(c);
		
	}

}
