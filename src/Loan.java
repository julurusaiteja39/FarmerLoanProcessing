import java.util.Arrays;

public class Loan {

	static int noOfLoans;
	private int loanNumber,loanAmount,tenure,emiAmount,noOfEmis, repaidAmount;
	protected boolean[] isEMIpaid;
	boolean[] isEmiPaid = new boolean[noOfEmis];
	int c = 0;
	
		
	public Loan() {
		noOfLoans++;
	}

	public int getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public int getEmiAmount() {
		return emiAmount;
	}

	public void setEmiAmount(int emiAmount) {
		this.emiAmount = emiAmount;
	}

	public int getNoOfEmis() {
		return noOfEmis;
	}

	public void setNoOfEmis(int noOfEmis) {
		this.noOfEmis = noOfEmis;
	}
	
	public int getRepaidAmount() {
		return repaidAmount;
	}

	public void setRepaidAmount(int repaidAmount) {
		this.repaidAmount = repaidAmount;
	}
	public void totalLoanTaken()
	{
		
		System.out.println(loanAmount);
	}

	public boolean[] getIsEmiPaid() {
		return isEmiPaid;
	}

	public void setIsEmiPaid(boolean[] isEmiPaid) {
		this.isEmiPaid = isEmiPaid;
	}
	/*public void changeIsEmiPaid
	{
		for(int i=0;i<noOfEmis;i++)
		{
			if(isEmiPaid[i] == false)
			{
				isEmiPaid[i]=true;
				break;
			}
		}
	}*/
	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", loanAmount=" + loanAmount + ", tenure=" + tenure + ", emiAmount="
				+ emiAmount + ", noOfEmis=" + noOfEmis + ", repaidAmount=" + repaidAmount + ", isEmiPaid="
				+ Arrays.toString(isEmiPaid) + "]";
	}
	public void payEmi(int emiAmount) {
		isEmiPaid[c++] = true;	
	}
	
}

