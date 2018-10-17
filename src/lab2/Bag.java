package lab2;

public class Bag {

	private int itemNo;
	private double weight;
	private double totalWeight;
	private int totalItems;
	private double totalPrice;
	private int breadCount, teaCount, milkCount, butterCount, otherCount;
	private double breadWeight, teaWeight, milkWeight, butterWeight, otherWeight;
	private int productNo;
	private double productWeight;

	Bag(int itemNo2, double weight2) {
		this.itemNo = itemNo2;
		this.weight = weight2;

	}

	public boolean putIn(PurchasedItem p) {

		if (totalItems < itemNo && totalWeight < weight) {
			totalItems = totalItems + 1;
			totalWeight = p.getWeight() + totalWeight;
			totalPrice = p.getPrice() + totalPrice;
			System.out.println("item successfully added");

			if (p.getProducts() == Products.BREAD) {
				breadCount = breadCount + 1;
				breadWeight = p.getWeight() + breadWeight;
			} else if (p.getProducts() == Products.TEA) {
				teaWeight = p.getWeight() + teaWeight;
			} else if (p.getProducts() == Products.MILK) {
				milkWeight = p.getWeight() + milkWeight;
			} else if (p.getProducts() == Products.BUTTER) {
				butterWeight = p.getWeight() + butterWeight;
			} else {
				otherWeight = p.getWeight() + otherWeight;
			}

			return true;

		} else
			System.out.println("Error bag is full");
		return false;
	}

	boolean putIn(PurchasedItem p[]) {

		if (totalItems < itemNo && totalWeight < weight) {
			for (int i = 0; i >= p.length; i++) {
				totalItems = i + 1;
				totalWeight = 4 * i;
				p[i] = new PurchasedItem(Products.MILK, 4.0, 5.0, "Non-Fat");
				milkCount = milkCount + 1;
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

		switch (p) {
		case BREAD:
			productNo = breadCount;
			break;
		case MILK:
			productNo = milkCount;
			break;
		case TEA:
			productNo = teaCount;
			break;
		case BUTTER:
			productNo = butterCount;
			break;
		case OTHER:
			productNo = otherCount;
			break;
		default:
			break;
		}
		return productNo;

	}

	double getProductWeight(Products p) {
		switch (p) {
		case BREAD:
			productWeight = breadWeight;
			break;
		case MILK:
			productWeight = milkWeight;
			break;
		case TEA:
			productWeight = teaWeight;
			break;
		case BUTTER:
			productWeight = butterWeight;
			break;
		case OTHER:
			productWeight = otherWeight;
			break;
		default:
			break;
		}
		return productWeight;

	}

}
