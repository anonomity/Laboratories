package lab2;

public class Bag {

	/* Initializing bag */
	private int itemNo;
	private double maxWeight;

	/* finding total value for specific bag */

	private double totalWeight;
	private int totalItems;
	private double totalPrice;

	/* getting type and weight for specific bag */
	private double thisWeight;
	private int count;
	private int totalSpecificProd;

	private PurchasedItem[] storage;

	Bag(int itemNo2, double weight2) {
		if(itemNo2 < 0 || weight2 < 0) {
			System.out.print(false);
		}
		else {
		this.itemNo = itemNo2;
		this.maxWeight = weight2;
		this.totalSpecificProd = 0;
		this.storage = new PurchasedItem[itemNo];
		count = 0;
		}

	}

	public boolean putIn(PurchasedItem p) {

		thisWeight = p.getWeight();
		if (totalItems < itemNo && totalWeight + thisWeight <= maxWeight) {
			this.storage[count] = p;
			this.count++;
			totalItems++;

			totalWeight = thisWeight + totalWeight;
			totalPrice = p.getPrice() + totalPrice;

			return true;

		} else
			return false;
	}

	boolean putIn(PurchasedItem p[]) {
		thisWeight = p[0].getWeight();
		if (totalItems + p.length <= itemNo && totalWeight + thisWeight <= maxWeight) {

			for (int i = 0; i < p.length; i++) {
				this.storage[count] = p[i];
				this.count++;
				thisWeight = p[i].getWeight();
				totalItems++;
				totalWeight = thisWeight + totalWeight;

			}

			return true;
		}
		return false;
	}

	public void makeEmpty() {
		totalItems = 0;
		totalWeight = 0;
		totalPrice = 0;
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
		totalSpecificProd = 0;
		for (int i = 0; i < totalItems; i++)
			if (this.storage[i].getProducts() == p) {
				totalSpecificProd++;

			}

		return totalSpecificProd;

	}

	double getProductWeight(Products p) {
		int count = 1;
		double productWeight = 0.0;
		for (int i = 0; i < totalItems; i++) {
			if (this.storage[i].getProducts() == p) {

				productWeight = count * thisWeight;
				count++;
			}
		}
		return productWeight;

	}

}
