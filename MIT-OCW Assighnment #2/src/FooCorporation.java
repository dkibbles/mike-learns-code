public class FooCorporation {

	double basePay;
	double hrsWorked;
	double totalPay;
	double overtimePay;
	double overtimeHrs;
	
	//constructor and class structure lookin nice!
	public FooCorporation(double basePay, double hrsWorked) {
	
		this.basePay = basePay;
		this.hrsWorked = hrsWorked;	
	}
				
	public void payCalc(double basePay, double hrsWorked) {	
	
		overtimeHrs = (hrsWorked - 40);
		
		if (hrsWorked > 40 && basePay > 8.00) {
		
			totalPay = (((hrsWorked - overtimeHrs) * basePay) + (overtimeHrs * (basePay * 1.5)));
			System.out.println(totalPay);
			
		} else if (hrsWorked <= 40 && basePay > 8.00) {
		
			totalPay = (hrsWorked * basePay);
			System.out.println(totalPay);
			
		} else {
		
			System.out.println("Error");
			
		}
	}

	/*I see what you mean about nested if then/else. Here's a way of thinking about it that might help:
	
	When entering any conditional, we want to think about entry/exit conditions and work inwards.
	In this case,
		2 entry conditions: stuff we're just given from the heavens:
			-basePay
			-hrsWorked
		2 exit: what we need our function/method/system to spit out
			-some math
			-an error

	So we can start by knocking out the error condition.
		Then worry about the math we gotta do
			If it's a lotta lotta math it goes in here
			If it's some other math it goes over here
		Remember to output some error msg from that first IF
	And we've returned both cases by the end of it
	*/
	public static void main(String[] args) {
	
		FooCorporation employee1 = new FooCorporation(7.50,35);
		FooCorporation employee2 = new FooCorporation(8.20,47);
		FooCorporation employee3 = new FooCorporation(10.00,73);
		
		employee1.payCalc(7.50,35);
		employee2.payCalc(8.20,47);
		employee3.payCalc(10.00,73);
	}
}
