package lab3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task4 {
	
	private int day;
	private int month;
	private int year;
	
	public Task4(String line) throws Exception {
		Pattern pat = Pattern.compile("(\\\\d{2}\\\\/)(\\\\d{2}\\\\/)(\\\\d{4})");
		Matcher m= pat.matcher(line);
	
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
		if(day < 1 && day > 31) {
			System.out.print("Day contains wrong format");
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
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your DOD");
		String DOB = scan.nextLine();
		Task4 c= new Task4(DOB);
		System.out.println(c);
		
		
		
		
		
		String pesel1="92071314764"; //correct PESEL formats
		String pesel2="81100216357";
		String pesel3="90080517455";
		String pesel1Wrong="96023510319";//incorrect PESEL formats
		String pesel2Wrong="90085517455";
		String date1="02.05.1996"; //correct date formats
		String date2="25/06/2000";
		String date3="01-12-1886";
		String date1Wrong="32.05.1996"; //incorrect date formats
		String date2Wrong="17/13/2005";
		String date3Wrong="13-12-3018";
		String time1="05:06:34"; //correct time formats
		String time2="00:00:00";
		String time3="07:59:59";
		String time1Wrong="15:35:60"; //incorrect time format
		String time2Wrong="17:74:15";
		String time3Wrong="24:00:00";
		String ip1="1.2.3.4"; //correct IP format
		String ip2="01.102.103.104";
		String ip3="255.255.253.0";
		String ip1Wrong="192.356.2.0"; //incorrect IP format
		String ip2Wrong="344.0.2.0";
		String ip3Wrong="0.42.42.42";
	}

}
