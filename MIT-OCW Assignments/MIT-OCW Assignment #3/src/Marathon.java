public class Marathon {
	
	public static int firstPlace(int[] times) {
		
		int index = 0;
		int min = times[index];

			for (int i = 1; i < times.length; i++){
				if (times[i] <= min){
					min = times[i];
				    index = i;
				        }
				    }
				        return index;
	}
	
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
		
		System.out.println(names[firstPlace(times)] + ": " + times[firstPlace(times)]);
		
		
	}
	
}
