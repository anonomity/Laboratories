package lab2;

public class Bag {

	/*Initializing bag*/
	private int itemNo; 
	private double weight; 
	
	/*finding total value for specific bag */
	private double totalWeight;
	private int totalItems;
	private double totalPrice;
	
	/*getting type and weight for specific bag*/
	private Products thistype;
	private double thisWeight;
	private int amount;
	
	private int arrayLength;


	Bag(int itemNo2, double weight2) {
		this.itemNo = itemNo2;
		this.weight = weight2;
		this.amount = 0;
		

	}

	public boolean putIn(PurchasedItem p) {

		if (totalItems < itemNo && totalWeight < weight) {
			totalItems = totalItems + 1;
			thistype = p.getProducts();
			thisWeight = p.getWeight();
			totalWeight = thisWeight + totalWeight;
			totalPrice = p.getPrice() + totalPrice;

			System.out.println("item successfully added");

			return true;

		} else
			System.out.println("Error bag is full");
		return false;
	}

	boolean putIn(PurchasedItem p[]) {

		if (totalItems < itemNo && totalWeight < weight) {
			/* for Testing array length */
			arrayLength = p.length;
			
		for (int i = 0; i < p.length; i++) {
				thistype = p[i].getProducts();
				thisWeight = p[i].getWeight();
				totalItems = totalItems + 1;
				totalWeight = thisWeight + totalWeight;
				
				System.out.println("item successfully added");
			}
			
			return true;
		}

		System.out.println("Error bag is full");
		return false;
	}

	public void makeEmpty() {
		totalItems = 0;
		totalWeight = 0;
		totalPrice = 0;
	}

	
	int getArrayLength() {
		return arrayLength;
	}
	double getTotalPrice() {
		return totalPrice;
	}

	double getTotalWeight() {
		return totalWeight;
	}

	int getTotalItem() {
		return totalItems;
	}

	int getProductNo(Products p) {
		
		for (int i = 0; i < this.totalItems; i++) {
			if (thistype == p) {
				amount++;
			}
		}
		return amount;

	}

	double getProductWeight(Products p) {
		int count = 1;
		double productWeight = 0.0;
		for (int i = 0; i < totalItems; i++) {
			if (thistype == p) {

				productWeight = count * thisWeight;
				count++;
			}
		}
		return productWeight;

	}

}
