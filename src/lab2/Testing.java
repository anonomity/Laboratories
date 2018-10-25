package lab2;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PurchasedItem t1 = new PurchasedItem(Products.BREAD, 60.0, 6.0, "Whole Wheat");
		PurchasedItem t2 = new PurchasedItem(Products.TEA, 1.0, 1.0, "Black");

		System.out.println(t1.getProducts() + " " + t1.getWeight() + " " + t1.getPrice() + " " + t1.getCom());

		System.out.println(t1.toString());
		System.out.println(t1.getProducts().toString());

		Bag first = new Bag(3, 600.00);

		first.putIn(t1);

		first.putIn(t2);
		first.putIn(t2);
		first.putIn(t2);

		System.out.println(first.getTotalWeight());
		System.out.println(first.getTotalItem());
		System.out.println(first.getTotalPrice());

		
		Bag arrayBag = new Bag(5, 300.00);
		/*PurchasedItem[] t3 = new PurchasedItem[5];*/
		int amount = 3;
		PurchasedItem[] arrayItem = new PurchasedItem[amount];
			for(int x=0; x < amount; x++) {
				arrayItem[x] = new PurchasedItem(Products.MILK, 8.0 , 4.0 , "41% fat" );
			}
			
		
		
		arrayBag.putIn(arrayItem);
		
		System.out.println(arrayBag.getArrayLength());
		System.out.println("array bag has....");
		System.out.println(arrayBag.getTotalItem() + " Items");
		System.out.println("Weighs " + arrayBag.getTotalWeight());
		
		System.out.println(arrayBag.getProductNo(Products.MILK));

		Bag second = new Bag(7, 300.0);

		second.putIn(t1);
		second.putIn(t1);
		second.putIn(t1);
		

		
		System.out.println(second.getProductNo(Products.BREAD));
		System.out.println(second.getProductWeight(Products.BREAD));

	}

}
