public class Marathon {
	
	public static int firstPlace() {
		
		int[] times = {
				
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
				343, 317, 265
				
		};
		
		int smallest = times[0];
	
		for(int i = 0; i<times.length; i++ ){
			if (times[i] < smallest) {
				smallest = times[i];
			}
		}      
		
		return smallest;
	}
	//Not sure how to make the firstPlace() method return the index instead of the value of the index
	
	public static void main (String[] arguments) {
		
		String[] names = {
				
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
				"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
				"Aaron", "Kate"
				
		};
		
		int[] times = {
				
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
				343, 317, 265
				
		};
			
			System.out.println(firstPlace());
			
		}
		
	}
