package lab3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab3 {
	
	private String regexPesel = "\\d{11}";
	private String regexDate = "(\\d{2})(\\/)(\\d{2})(\\/)(\\d{4})";
	private String regexTime = "(\\d{2})(\\:)(\\d{2})(\\:)(\\d{2})";
	private String regexIP = "(\\d{1,3})(\\.)(\\d{1,3})(\\.)(\\d{1,3})(\\.)(\\d{1,3})";
	private int count = 0;
	// for Date Checking
	private int day;
	private int month;
	private int year;

	//for time checking
	private int hours;
	private int minutes;
	private int seconds;
	
	//for IP checking
	private int first;
	private int second;
	private int third;
	private int fourth;
	
	Lab3(String input) {
		
		Pattern Pesel = Pattern.compile(regexPesel);
		Matcher m1 = Pesel.matcher(input);
		
		if(m1.find() == true ) {
			System.out.println(m1.group().trim()); 
			System.out.println("type: Pesel");
			count++;
		}
		Pattern Date = Pattern.compile(regexDate);
		Matcher m2 = Date.matcher(input);
		
		if(m2.find() == true){
			String dayS = m2.group(1);
			day = Integer.parseInt(dayS);
			String monthS = m2.group(3);
			month = Integer.parseInt(monthS);
			String yearS = m2.group(5);
			year = Integer.parseInt(yearS);
			
			if(day <= 31 && day > 0 && month > 0 && month <= 12 && year > 1800 && year < 3000) {
			count++;
			System.out.println(m2.group().trim()); 	
			System.out.println("type: Date");	
			}
			else {
				System.out.print("inproper format");
			}
		}
		Pattern Time = Pattern.compile(regexTime);
		Matcher m3 = Time.matcher(input);
		
		if(m3.find() == true) {
			String hourS = m3.group(1);
			hours = Integer.parseInt(hourS);
			String minuteS = m3.group(3);
			minutes = Integer.parseInt(minuteS);
			String secondS = m3.group(5);
			seconds = Integer.parseInt(secondS);
			
			if(hours >= 0 && hours < 24 && minutes >= 0 && minutes < 60 && seconds >= 0 && seconds < 60) {
			count++;
			System.out.println(m3.group().trim()); 	
			System.out.println("type: Time");
			}
			
		
		}
		Pattern Ip = Pattern.compile(regexIP);
		Matcher m4 = Ip.matcher(input);
		
		if(m4.find()== true) {
			String firstS = m4.group(1);
			first = Integer.parseInt(firstS);
			String secondS = m4.group(3);
			second = Integer.parseInt(secondS);
			String thirdS = m4.group(5);
			third = Integer.parseInt(thirdS);
			String fourthS = m4.group(7);
			fourth = Integer.parseInt(fourthS);
			
			if(first > 0 && first <= 255 && second >= 0 && second <= 255 && third >= 0 && third <= 255 && fourth >= 0 && fourth <= 255) {
			count++;
			System.out.println(m4.group().trim()); 	
			System.out.println("type: IP address");
			}
			else {
				System.out.print("inproper format");
			}
		}
		
		else if(count == 0) {
			System.out.print("inproper format");
		}

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Pesel1 = "33333222332";
		String Pesel2 = "3332211334f";

		String Date1 = "23/12/2000";
		String date2="25/06/2000";
		String date3="01-12-1886";
		String date1Wrong="32.05.1996";
		
		//correct time formats
		
		String time1="05:06:34";
		String time2="00:00:00";
		String time3="07:59:59";
		String time1Wrong="15:35:60"; 
		
		//incorrect time format
		
		String time2Wrong="17:74:15";
		String time3Wrong="24:00:00";
		
		//correct IP format
		String ip1="1.2.3.4"; 
		String ip2="01.102.103.104";
		String ip3="255.255.253.0";
		
		//incorrect IP format
		String ip1Wrong="192.356.2.0"; 
		String ip2Wrong="344.0.2.0";
		String ip3Wrong="0.42.42.42";
		
		
		Lab3 test = new Lab3(date1Wrong);
		
	}

}
