package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class ExchangeCalculator {

	private double result1 = 0.0;
	private int sellCheck = 0;
	private double amount = 0.0;
<<<<<<< HEAD
	
	private String cur;
	private double rate2;
=======

	private String cur;
	private double rate2;
	private String[] newFormat;
>>>>>>> master

	public Vector<Currency> rates = new Vector<Currency>();

	// accepted formats: buy 9990 USD or sel 9999 USD exit
<<<<<<< HEAD
=======
	
	
>>>>>>> master
	public void calculateRates() {

		Scanner scInput = new Scanner(System.in);
		while (scInput.hasNextLine()) {
			String line = scInput.nextLine().trim();
			if (line.equalsIgnoreCase("exit"))
				break;
<<<<<<< HEAD
			/*System.out.println(result1);*/
			
			
			result1 = calculate(line);
			
=======
			/* System.out.println(result1); */

			result1 = calculate(line);
		
>>>>>>> master
			
			System.out.println("rate is " + rate2);
		}
		scInput.close();
	}
<<<<<<< HEAD

	protected double calculate(String line) {
		String array1[] = line.toLowerCase().split("\\s");
		/*String s = rates.toString();
		System.out.println(s);
		s = s.replace(',', ' '); */
		check(array1);
		/*System.out.println(check(array1));*/
		amount = Double.parseDouble(array1[1]);
		cur = array1[2];
		System.out.println("idk what this will say" + rates.equals(array1[2]));
		System.out.println(sellCheck);
		if (check(array1) == true && sellCheck == 1) {
			result1 = amount + result1;
		}
		else if(check(array1) == true && sellCheck == 0 ) {
			result1 = result1 - amount;
		}
		/*curr = array1[2];*/
		
		/*System.out.println("Index =  " + rates.contains(" AUD	[1]	2.6638"));*/

		
=======
	
	
	
	
	
	

	protected double calculate(String line) {
		String array1[] = line.toLowerCase().split("\\s");
		
		 String s = rates.toString(); 
		 s = s.replace(',', ' ');
		 newFormat = s.toLowerCase().split("\\s");
		 System.out.println("I hope its a currency " + newFormat[4] + " " + newFormat[1] + " " + newFormat[2] + " " + newFormat[3]);
		check(array1);
		
		amount = Double.parseDouble(array1[1]);
		cur = array1[2];
		System.out.println("idk what this will say " + rates.equals(array1[2]));
		System.out.println(sellCheck);
		if (check(array1) == true && sellCheck == 1) {
			result1 = amount + result1;
		} else if (check(array1) == true && sellCheck == 0) {
			result1 = result1 - amount;
		}
		/* curr = array1[2]; */

		/* System.out.println("Index =  " + rates.contains(" AUD	[1]	2.6638")); */
>>>>>>> master

		return result1; // to be replaced
	}

<<<<<<< HEAD
=======
	
	
	
	
	
	
	
>>>>>>> master
	boolean check(String s[]) {
		boolean result = false;
		double second = Double.parseDouble(s[1]);
		// he may not like this ugly piece of shiet so make array and add 1s
		// andrzej smells funny
<<<<<<< HEAD
		
		if (s[0].equals("sell")) {
			sellCheck = 1;
			result = true;
		}
		else if(s[0].equals("buy")) {
			sellCheck = 0;
			result = true;
		}
		else if (s[2].length() == 3) {
=======

		if (s[0].equals("sell")) {
			sellCheck = 1;
			result = true;
		} else if (s[0].equals("buy")) {
			sellCheck = 0;
			result = true;
		} else if (s[2].length() == 3) {
>>>>>>> master
			result = true;
		}

		else if (second > 0) {

			result = true;
		}

		return result;

	}

<<<<<<< HEAD
=======
	
	
	
	
	
	
>>>>>>> master
	public ExchangeCalculator(String fn) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(fn));
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			try {
				Currency c = new Currency(line);
				String input1[] = line.toLowerCase().split("\\s");
<<<<<<< HEAD
				for(int i = 0; i > line.length(); i++) {
				
				
				}
				/*cur = input1.getCode();
				System.out.println(cur);
				rate2 = input1.getRate(); */
				rates.addElement(c);
				
				
=======
				for (int i = 0; i > line.length(); i++) {

				}
				/*
				 * cur = input1.getCode(); System.out.println(cur); rate2 = input1.getRate();
				 */
				rates.addElement(c);

>>>>>>> master
			} catch (Exception ex) {
				// missing?
			}
		}
		sc.close();
	}
	// missing

<<<<<<< HEAD
=======
	
	
	
	
	
>>>>>>> master
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String fn = "ExchangeRates.txt";
		ExchangeCalculator calc = null;
		try {
			calc = new ExchangeCalculator(fn);
		} catch (FileNotFoundException e) {
			System.err.println("Unable to read exchange rates from file: " + fn);
			System.exit(1);
		}
		calc.calculateRates();
<<<<<<< HEAD
		
		System.exit(0);
	
=======

		System.exit(0);

>>>>>>> master
	}

}
