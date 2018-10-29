package lab2;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PurchasedItem t1 = new PurchasedItem(Products.BREAD, 60.0, 6.0, "Whole Wheat");
		PurchasedItem t2 = new PurchasedItem(Products.TEA, 1.0, 1.0, "Black");
		PurchasedItem t3 = new PurchasedItem(Products.OTHER, 37.0, 1.0, "Sweets");

		System.out.println(t1.getProducts() + " " + t1.getWeight() + " " + t1.getPrice() + " " + t1.getCom());

		System.out.println(t1.toString());
		System.out.println(t1.getProducts().toString());

		Bag first = new Bag(5, 100.00);

		//filling up bag with max weight and max items
		first.putIn(t1);
		first.putIn(t2);
		first.putIn(t2);
		first.putIn(t2);
		first.putIn(t3);
		
		//doesn't add this
		first.putIn(t3);

		System.out.println(first.getTotalWeight());
		System.out.println(first.getTotalItem());
		System.out.println(first.getTotalPrice());

		Bag arrayBag = new Bag(5, 300.00);

		int amount = 2;
		PurchasedItem[] arrayItem = new PurchasedItem[amount];
		for (int x = 0; x < amount; x++) {
			arrayItem[x] = new PurchasedItem(Products.MILK, 8.0, 4.0, "41% fat");
		}
		int amount2 = 2;
		PurchasedItem[] arrayItem2 = new PurchasedItem[amount2];
		for (int x = 0; x < amount2; x++) {
			arrayItem2[x] = new PurchasedItem(Products.BUTTER, 10.0, 5.0, "100% fat");
		}
		

		arrayBag.putIn(arrayItem);
		arrayBag.putIn(arrayItem2);
		
		
		System.out.println("I have " + arrayBag.getProductNo(Products.BUTTER));
		System.out.println("I have " + arrayBag.getProductNo(Products.MILK));
		System.out.println("array bag has....");
		System.out.println(arrayBag.getTotalItem() + " Items");
		System.out.println("Weighs " + arrayBag.getTotalWeight());
		System.out.println("In this bag BUTTERs weight is... " + arrayBag.getProductWeight(Products.BUTTER));

		Bag second = new Bag(7, 300.0);

		second.putIn(t1);
		second.putIn(t1);
		second.putIn(t1);

		System.out.println(second.getProductNo(Products.BREAD));
		System.out.println(second.getProductWeight(Products.BREAD));
		
		
	}

}
