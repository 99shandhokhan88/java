package sys.bean;

public class Company {
	
	private String vatNumber;
	private String buisnessName;
	private String legalAdress;
	
	public String getVatNumber() {
		return vatNumber;
	}
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
	public String getBuisnessName() {
		return buisnessName;
	}
	public void setBuisnessName(String buisnessName) {
		this.buisnessName = buisnessName;
	}
	public String getLegalAdress() {
		return legalAdress;
	}
	public void setLegalAdress(String legalAdress) {
		this.legalAdress = legalAdress;
	}
	
	public Company(String vatNumber, String buisnessName, String legalAdress) {
		this.vatNumber = vatNumber;
		this.buisnessName = buisnessName;
		this.legalAdress = legalAdress;
	}
	
	@Override
	public String toString() {
		return "Company [vatNumber=" + vatNumber + ", buisnessName=" + buisnessName + ", legalAdress=" + legalAdress
				+ "]";
	}
	
}
