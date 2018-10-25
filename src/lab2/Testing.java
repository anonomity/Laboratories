package lab2;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PurchasedItem t1 = new PurchasedItem(Products.BREAD, 60.0, 6.0, "Whole Wheat");
		PurchasedItem t2 = new PurchasedItem(Products.TEA, 1.0, 1.0, "Black");

		System.out.println(t1.getProducts() + " " + t1.getWeight() + " " + t1.getPrice() + " " + t1.getCom());

		System.out.println(t1.toString());
		System.out.println(t1.getProducts().toString());

		Bag first = new Bag(3, 60);

		first.putIn(t1);

		first.putIn(t2);
		first.putIn(t2);
		first.putIn(t2);

		System.out.println(first.getTotalWeight());
		System.out.println(first.getTotalItem());
		System.out.println(first.getTotalPrice());

		/*PurchasedItem[] t3 = new PurchasedItem[5];*/

		Bag second = new Bag(7, 300.0);

		second.putIn(t1);
		second.putIn(t1);
		second.putIn(t1);
		

		
		System.out.println(second.getProductNo(Products.BREAD));
		System.out.println(second.getProductWeight(Products.BREAD));

	}

}
