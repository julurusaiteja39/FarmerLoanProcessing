
public class FieldAddress {
	FieldAddress(){}
	
	static class Address{
		int surveyNo;
		String locality,taluka, district, state;	
		Address(int surveyNo, String locality,String taluka,String district,String state){
			this.surveyNo = surveyNo;
			this.locality = locality;
			this.taluka = taluka;
			this.district = district;
			this.state = state;
		}
		public int getSurveyNo() {
			return surveyNo;
		}
		public void setSurveyNo(int surveyNo) {
			this.surveyNo = surveyNo;
		}
		public String getLocality() {
			return locality;
		}
		public void setLocality(String locality) {
			this.locality = locality;
		}
		public String getTaluka() {
			return taluka;
		}
		public void setTaluka(String taluka) {
			this.taluka = taluka;
		}
		public String getDistrict() {
			return district;
		}
		public void setDistrict(String district) {
			this.district = district;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public void displayFieldAddress() {
			System.out.println("Survey Number:"+surveyNo);
			System.out.println("Locality:"+locality);
			System.out.println("Taluka:"+taluka);
			System.out.println("District:"+district);
			System.out.println("State:"+state);				
		}

	}
}

