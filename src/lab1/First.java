package lab1;

public class First {
		
		private String name; 
		private double weight;
		
		First() {
			name = "no-name";
			weight = 1.0;
		}
	
		First(String name2, double weight2){
			this.name = name2;
			this.weight = weight2;
			
			if(weight2 >= 10.0 || weight2 < 0.0)
			{
				weight = 1.0;
			}
			else if(name2.length() == 0 || name2 == null) {
				
				name = "no-name";
			}
		}
		
		First(double weight2){
			this.weight = weight2;
			String name2 = this.name;
				if(weight2 >= 10.0 || weight2 < 0.0)
				{
					weight = 1.0;
					
				}
				if(name2 == null || name2.length() == 0) {
					name = "no-name";
				}
			}
		
		First(String name2){
			this.name = name2;
			double weight2 = weight;
				if(name2.length() == 0 || name2 == null)
				{
					name = "no-name";
				}
				if(weight2 == 0 )
				{
					weight = 1.0;
				}
			}
		
		
		public String getString() {
			return name;
		}
		
		
		public double getWeight() {
			return weight;
		}

		
	}


