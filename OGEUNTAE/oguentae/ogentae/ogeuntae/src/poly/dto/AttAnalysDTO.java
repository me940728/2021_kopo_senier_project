package poly.dto;
// 출근자 리스트 불러와서 분석하기 위한 DTO

public class AttAnalysDTO {
	
	private String empno; // 사원번호
	private String ename; // 사원이음
	private String sex; // 성별
	private String addrs; // 주소
	private String bday; // 생년월일
	private String att_date; // 출근시간
	private String reg_dt; // 데이터 입력 시간
	private String late_Check; // 지각 or 정상출석으로 
	private String cnt; // 인원 총원 구하기S
	
	//########아래는 몽고에서 값 가져오는데 사용########
	
	private String mongo_month; // 월별 집계
	private String mongo_late_checkCount; // 카운트 결과
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getBday() {
		return bday;
	}
	public void setBday(String bday) {
		this.bday = bday;
	}
	public String getAtt_date() {
		return att_date;
	}
	public void setAtt_date(String att_date) {
		this.att_date = att_date;
	}
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getLate_Check() {
		return late_Check;
	}
	public void setLate_Check(String late_Check) {
		this.late_Check = late_Check;
	}
	public String getCnt() {
		return cnt;
	}
	public void setCnt(String cnt) {
		this.cnt = cnt;
	}
	public String getMongo_month() {
		return mongo_month;
	}
	public void setMongo_month(String mongo_month) {
		this.mongo_month = mongo_month;
	}
	public String getMongo_late_checkCount() {
		return mongo_late_checkCount;
	}
	public void setMongo_late_checkCount(String mongo_late_checkCount) {
		this.mongo_late_checkCount = mongo_late_checkCount;
	}
	
	
	
}

