package lab3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
	
	private int day;
	private int month;
	private int year;
	
	public Task4(String line) throws Exception {
		Pattern pat = Pattern.compile("(\\d{2}\\/)(\\d{2}\\/)(\\d{4})");
		Matcher m= pat.matcher(line);
		if(!m.find()) {
			throw new Exception();
		}
		try {
			String field=m.group(1);
			day=Integer.parseInt(field);
			field=m.group(2);
			month =Integer.parseInt(field);
			field=m.group(3);
			year =Integer.parseInt(field);
		} catch (Exception ex) {
			throw new Exception();
		}
	}
	public int getDay() {
		return(day);
	}
	public int getMonth() {
		return(month);
	}
	public int getYear() {
		return(year);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Task4 c= new Task4("223");
		System.out.println(c);
		
	}

}
