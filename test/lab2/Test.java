package lab2;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
	
	void test() {
		PurchasedItem t1 = new PurchasedItem(Products.BREAD, 60.0, 6.0, "Whole Wheat");
		Bag first = new Bag(3,60);
		first.putIn(t1);
		first.putIn(t1);
		
		assertEquals(2,first.getTotalItem());
	}

}
