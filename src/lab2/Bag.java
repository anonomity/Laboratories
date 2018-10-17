package lab2;

public class Bag {
	
	private int itemNo;
	private double weight;
	private double totalWeight;
	private int totalItems;
	private double totalPrice;
	
	
	
	Bag(int itemNo2, double weight2){
		this.itemNo = itemNo2;
		this.weight = weight2;
		
	}
	
	public boolean putIn(PurchasedItem p) {
		
		if(totalItems < itemNo && totalWeight < weight) {
			totalItems = totalItems + 1;
			totalWeight = p.getWeight() + totalWeight;
			totalPrice = p.getPrice() + totalPrice;
			System.out.println("item successfully added");
			return true;
		
		}
		else 
			System.out.println("Error bag is full");	 
			return false;
		}

	
	boolean putIn(PurchasedItem p[]) {
		
	for(int i=0; i >= p.length;i++){
	
	if(totalItems < itemNo && totalWeight < weight) {
			totalItems = i + 1;
			totalWeight = 4 * i;
			p[i] = new PurchasedItem(Products.MILK, 4.0 , 5.0 , "Non-Fat");
			
			System.out.println("item successfully added");
			}
		return true;}
	
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
/**	
	int getProductNo(Product p) {
	
	}
	double getProductWeight(Product);
		
	**/
	

}
