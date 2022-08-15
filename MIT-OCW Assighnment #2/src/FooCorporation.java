public class FooCorporation {

	double basePay;
	double hrsWorked;
	double totalPay;
	double overtimePay;
	double overtimeHrs;
	
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
	public static void main(String[] args) {
	
		FooCorporation employee1 = new FooCorporation(7.50,35);
		FooCorporation employee2 = new FooCorporation(8.20,47);
		FooCorporation employee3 = new FooCorporation(10.00,73);
		
		employee1.payCalc(7.50,35);
		employee2.payCalc(8.20,47);
		employee3.payCalc(10.00,73);
	}
}
