
public class WaterPipeLineLoan extends Loan{

	private String sourceOfPipeline;
	private int lengthOfPipeline;
	private final double INTREST_RATE=5;
	
	public WaterPipeLineLoan(String sourceOfPipeline, int lengthOfPipeline) {
		this.sourceOfPipeline = sourceOfPipeline;
		this.lengthOfPipeline = lengthOfPipeline;
	}

	
	public String getSourceOfPipeline() {
		return sourceOfPipeline;
	}
	public void setSourceOfPipeline(String sourceOfPipeline) {
		this.sourceOfPipeline = sourceOfPipeline;
	}
	
	public int getLengthOfPipeline() {
		return lengthOfPipeline;
	}
	
	public void setLengthOfPipeline(int lengthOfPipeline) {
		this.lengthOfPipeline = lengthOfPipeline;
	}
	
	public double displaySimpleIntrestOfWaterPipelineLoan() {
		double si=350000*12*INTREST_RATE/100;
		double totalWPLEmiAmount = si+350000;
		System.out.println("Simple intrest for Water pipeline loan is:"+si);
		double monthlyWPLAmount = totalWPLEmiAmount/12;
		//System.out.println(monthlyWPLAmount);
		System.out.println("Monthly water pipeline loan Emi Amount is:"+monthlyWPLAmount);
		return monthlyWPLAmount;
	}
	
	@Override
	public String toString() {
		return "WaterPipeLineLoan [sourceOfPipeline=" + sourceOfPipeline + ", lengthOfPipeline=" + lengthOfPipeline
				+ ", intrestRate=" + INTREST_RATE + "]";
	}
	public void displayWaterPipeLineLoan() {
		System.out.println("Length Of Pipe:- "+lengthOfPipeline);
		System.out.println("Source Of Water:- "+sourceOfPipeline);
		System.out.println("Rate Of Interest:- "+INTREST_RATE);
	}

}
