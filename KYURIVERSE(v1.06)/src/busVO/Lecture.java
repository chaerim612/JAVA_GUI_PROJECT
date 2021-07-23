package busVO;

public class Lecture {
	
	
	String LecName;//회사이름
	String eng;//외국어능력
	String minPro;//개발경험(강의 내용)
	String license;//자격증
	String codingTest;//코딩테스트
	String degree;//학위
	
	
	public Lecture(String LecName,String eng,String minPro,String license,String codingTest,String degree) {
		this.LecName=LecName;
		this.minPro=minPro;
		this.eng=eng;
		this.license=license;
		this.codingTest=codingTest;
		this.degree=degree;
		
	}

	public String getLecName() {
		return LecName;
	}

	public void setBusName(String LecName) {
		this.LecName = LecName;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getMinPro() {
		return minPro;
	}

	public void setMinPro(String minPro) {
		this.minPro = minPro;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getCodingTest() {
		return codingTest;
	}

	public void setCodingTest(String codingTest) {
		this.codingTest = codingTest;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
}
