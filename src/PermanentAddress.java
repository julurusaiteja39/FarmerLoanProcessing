
public class PermanentAddress {
	PermanentAddress(){}
	
	static class Address{
		String houseNo;
		String locality,taluka, district, state;	
		Address(String houseNo, String locality,String taluka,String district,String state){
			this.houseNo = houseNo;
			this.locality = locality;
			this.taluka = taluka;
			this.district = district;
			this.state = state;
		}
		public String getHouseNo() {
			return houseNo;
		}
		public void setHouseNo(String houseNo) {
			this.houseNo = houseNo;
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
		public void displayPermanentAddress() {
			System.out.println("House Number:"+houseNo);
			System.out.println("Locality:"+locality);
			System.out.println("Taluka:"+taluka);
			System.out.println("District:"+district);
			System.out.println("State:"+state);				
		}

	}
}
