package lab3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Currency;
import java.util.Scanner;
import java.util.Vector;

public class ExchangeCalculator {
	
	private Vector<Currency> rates = new Vector<Currency>();
	//accepted formats: buy 9990 USD or sel 9999 USD exit
	public void calculateRates() {
		Scanner scInput = new Scanner(System.in);
		while (scInput.hasNextLine()) {
			String line = scInput.nextLine().trim();		
			if (line.equalsIgnoreCase("exit"))
				break;
			double result = calculate(line);
			System.out.println(line+"\t"+result);
		}
		scInput.close();
	}
	protected double calculate(String line) {
		return 0.0; // to be replaced
	}
	public ExchangeCalculator(String fn) throws FileNotFoundException {
		Scanner sc = new Scanner (new File(fn));
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			try {
				Currency c = new Currency(line);
				rates.addElement(c);
			}
			catch (Exception ex) {
				//missing?
			}
		}
	sc.close();
	}
	//missing
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fn = "ExchangeRates.txt";
		ExchangeCalculator calc = null;
		try {
			calc = new ExchangeCalculator(fn);
		} catch (FileNotFoundException e) {
			System.err.println("Unable to read exchange rates from file: "+fn);
			System.exit(1);
		}
		calc.calculateRates();
		System.exit(0);

	}

}
