
public class FarmerLoanProcessing {

	public static void main(String[] args) {
		int surveyNo = 121;
		Farmer farmer1 = new Farmer("Sai","Teja","123456789123","1-2-3",surveyNo++,"Vidyanagar","Jambikunta","Medak","Telangana");
		farmer1.takeLoan("Crop Loan");		
		farmer1.takeLoan("Tractor Loan");
		farmer1.displayFarmer();
		farmer1.payEmi(1,"Crop Loan");
		farmer1.payEmi(2,"Tractor Loan");
		
		int ar[] = farmer1.getEmiArray();
		for(int i=0;i<3;i++) {
			if(ar[i] == 0) {
				continue;
			}else {
				if(i==0) 
					System.out.println("Crop Loan");
				else if(i == 1) 
					System.out.println("Water Pipe Loan");
				else 
					System.out.println("Trator Loan");
				System.out.println("Emi's Left :"+ar[i]);
				System.out.println();
			}
		}
		
		Farmer farmer2 = new Farmer("Ram","Krishna","567891234538","5-6-7",surveyNo++,"Simhapuri colony","Pragatinagar","Hyderabad","Telangana");
		farmer2.takeLoan("Crop Loan");
		farmer2.takeLoan("Tractor Loan");
		farmer2.takeLoan("Water Pipe Loan");
		farmer2.displayFarmer();
		
		farmer2.payEmi(3,"Water Pipe Loan");
		farmer2.payEmi(2,"Crop Loan");
		
		
		
		int ar1[] = farmer2.getEmiArray();
		for(int i=0;i<3;i++) {
			if(ar1[i] == -12) {
				
			}else {
				if(i==0) System.out.println("Crop Loan");
				else if(i == 1) System.out.println("Water Pipe Loan");
				else System.out.println("Trator Loan");
				System.out.println("Emi's Left :"+ar1[i]);
			}
		}
		System.out.println("Total no of loans by company is:"+Loan.noOfLoans);
		System.out.println("Total amount disbursed is:"+Farmer.totalLoanAmount);
		System.out.println("Total amount repaid is:"+Farmer.repaidLoanAmount);
		
	}
}
