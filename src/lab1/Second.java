package lab1;



public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First t1 = new First("Henry", 19.0);
		
		System.out.println(t1.getString() + " " + t1.getWeight());
		System.out.println(t1.toString());
		System.out.println(t1.getString().toString());
		
		
		First t2 = new First("Matilda");
		
		System.out.println(t2.getString() + " " + t2.getWeight());
		
		First t3 = new First(9.0);
		
		System.out.println(t3.getString() + " " + t3.getWeight());
		
		
		
		
		
		
			
	}

}
