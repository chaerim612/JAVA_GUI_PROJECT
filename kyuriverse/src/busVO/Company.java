package busVO;

public class Company {
	String cName;
	String cAddress;
	String cInfo;
	
	public Company(String cName,String cAddress,String cInfo) {
		this.cName=cName;
		this.cAddress=cAddress;
		this.cInfo=cInfo;
	
	}
	
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcInfo() {
		return cInfo;
	}

	public void setcInfo(String cInfo) {
		this.cInfo = cInfo;
	}

}
