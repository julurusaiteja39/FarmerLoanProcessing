public class TractorLoan extends Loan{
	String nameOfCompany,tractorModel;
	double INTREST_RATE=7;
	TractorLoan(String nameOfCompany,String tractorModel ){
		this.nameOfCompany = nameOfCompany;
		this.tractorModel = tractorModel;
		
	}	
	public double displaySimpleIntrestOfTractorLoan() {
		double si=500000*12*INTREST_RATE/100;
		System.out.println("Simple intrest for Tractor loan is:"+si);
		double totalTLEmiAmount = si + 200000;
		double monthlyTLEmi = totalTLEmiAmount/12;
		System.out.println("Monthly crop loan Emi Amount is:"+monthlyTLEmi);
		return monthlyTLEmi;
	}
	public void displayTractorLoan() {
		System.out.println("Company Name:"+nameOfCompany);
		System.out.println("Tractor Model:"+tractorModel);
		System.out.println("Rate Of Interest:"+INTREST_RATE);
	}

}




