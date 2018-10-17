package lab2;

public class PurchasedItem {

		private Products type;
		private double weight;
		private double price;
		private String com;
		
		PurchasedItem(){
			type = type.OTHER;
			weight = 1.0;
			price = 100.00;
			com = " ";
		}
		
		PurchasedItem(Products type2 , double weight2, double price2, String com2) 
		{
			this.type = type2;
			this.weight = weight2;
			this.price = price2;
			this.com = com2;
			
			if(weight2 < 0.01 || weight2 > 100.00) {
				weight = 1.00;
			}
			if (price2 < 1.00 || price2 > 10000.00) {
				price = 100.00;
			}
			
			
		}
		
		
		public Products getProducts() {
			return type;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public double getPrice() {
			return price;
		}
		
		public String getCom() {
			return com ;
		}
		
	
		
		
		
}
