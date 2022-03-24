
public class Address {
	
	private String locality,taluka,district,state;
	private String houseNo,surveyNo;
	
	public Address(String houseNo, String locality, String taluka, String district, String state, String surveyNumber) {
		this.locality=locality;
		this.taluka=taluka;
		this.district=district;
		this.state=state;
		this.houseNo=houseNo;
		this.surveyNo = surveyNo;
		/*if(null == houseNo) {
			FieldAddress fieldAddress = new FieldAddress();
			fieldAddress.setSurveyNumber(surveyNumber);
		}else if(null == surveyNumber) {
			PermanentAddress pm = new PermanentAddress();
			pm.setHouseNumber(houseNo);
		}*/
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

	
	@Override
	public String toString() {
		return "Address [locality=" + locality + ", taluka=" + taluka + ", district=" + district + ", state=" + state
				+ "]";
	}


	void displayAddress()
	{
		System.out.println("Address is:");
		System.out.println("Locality:"+getLocality());
		System.out.println("Taluka:"+getTaluka());
		System.out.println("District:"+getDistrict());
		System.out.println("State:"+getState());
	}
	/*
	class FieldAddress{
		
		private String surveyNumber;

		public String getSurveyNumber() {
			return surveyNumber;
		}

		public void setSurveyNumber(String surveyNumber) {
			this.surveyNumber = surveyNumber;
		}		
		
	}
	
	class PermanentAddress{
			
			private String houseNumber;

			public String getHouseNumber() {
				return houseNumber;
			}

			public void setHouseNumber(String houseNumber) {
				this.houseNumber = houseNumber;
			}		
			
		}
	*/

}
