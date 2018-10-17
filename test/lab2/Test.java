package lab2;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test

	void test() {
		PurchasedItem t3 = new PurchasedItem(Products.BREAD, 44.0, 2.0, "Whole Wheat");
		PurchasedItem t2 = new PurchasedItem(Products.BREAD, 1.0, 1.0, "Black");

		Bag second = new Bag(7, 115.0);

		second.putIn(t3);
		second.putIn(t3);

		second.putIn(t2);

		assertEquals(89.0, second.getProductWeight(Products.BREAD));
	}

}
