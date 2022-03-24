import java.util.Arrays;

public class Farmer {
	
	//private static final String Address = null;
	private String firstName,lastName;
	private boolean[] loansTaken = new boolean[3];
	//private int[] loanAmount = new int[3];
	//private int[] loanRepaid = new int[3];
	private String aadharNumber;
	static int totalLoanAmount;
	static int repaidLoanAmount;
	
	Loan obj1;
	int emiCount[] = {0,0,0};
	boolean loantaken[] = new boolean[3];
	PermanentAddress.Address obj;
	FieldAddress.Address objf;
	public Farmer(String firstName, String lastName, String aadharNumber,String Address, int surveyNo,String locality,String taluka,String district,String state) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.aadharNumber = aadharNumber;
		obj  = new PermanentAddress.Address(Address,locality,taluka,district,state);
		objf = new FieldAddress.Address(surveyNo,locality,taluka,district,state);
		obj1 = new Loan();
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAadharNumber() {
		return aadharNumber;
	}
	
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public void displayFarmer() {
		System.out.println("First Name :"+firstName);
		System.out.println("Last Name :"+lastName);
		System.out.println("Adhar Number :"+aadharNumber);
		System.out.println("Address :-");
		obj.displayPermanentAddress();
		System.out.println("Loans taken by farmer is:");
		if(loantaken[0]!=false) {
			System.out.println("Crop Loan");
		}
		if(loantaken[1]!=false) {
			System.out.println("Water Pipe Line Loan");
		}
		if(loantaken[2]!=false) {
			System.out.println("Tractor Loan");
		}			
	}
	public void takeLoan(String s) {		
		if(s.equals("Crop Loan")) {			
			CropLoan obj = new CropLoan("Cotton",200000);
			obj.displaySimpleIntrestOfCropLoan();
			loansTaken[0] = true;
			emiCount[0] = 12;
			totalLoanAmount += 200000;
		}else if(s.equals("Water Pipe Loan")) {
			WaterPipeLineLoan obj = new WaterPipeLineLoan("Falcon",30);
			obj.displayWaterPipeLineLoan();
			loansTaken[1] = true;
			emiCount[1] = 12;
			totalLoanAmount += 350000;
		}else {
			TractorLoan obj = new TractorLoan("Mahindra","2022");
			obj.displayTractorLoan();
			loansTaken[2] = true;
			emiCount[2] = 12;
			totalLoanAmount += 500000;
		}
	}
	public void payEmi(int count,String cropName) {
		
		CropLoan loan1 = null;
		WaterPipeLineLoan loan2 = null;
		TractorLoan loan3 = null;
		if(cropName.equals("Crop Loan")) {
			loan1 = new CropLoan(cropName, count);
			emiCount[0] -= count;
			repaidLoanAmount += loan1.displaySimpleIntrestOfCropLoan();
		}else if(cropName.equals("Water Pipe Loan")) {			
			emiCount[1] -= count;
			loan2 = new WaterPipeLineLoan(cropName, count);
			repaidLoanAmount += loan2.displaySimpleIntrestOfWaterPipelineLoan();			
		}else {			
			emiCount[2] -= count;
			loan3 = new TractorLoan(cropName, cropName);
			repaidLoanAmount += loan3.displaySimpleIntrestOfTractorLoan();
		}		
	}
	public int[] getEmiArray() {
		return emiCount;
	}

	@Override
	public String toString() {
		return "Farmer [firstName=" + firstName + ", lastName=" + lastName + ", loansTaken="
				+ Arrays.toString(loansTaken) + ", aadharNumber=" + aadharNumber + ", obj1=" + obj1 + ", emiCount="
				+ Arrays.toString(emiCount) + ", loantaken=" + Arrays.toString(loantaken) + ", obj=" + obj + "]";
	}

	
	
	
}
