package SubcriberInfo;

public class SubCriverInfo {
	String name, id, password;
	String phoneNo, address;
	
	void changePassword(String password) {
		this.password = password;
	}
	
	void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	//생성자 작성
	public SubCriverInfo() {
	}
	
	public SubCriverInfo(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public SubCriverInfo(String name, String id, String password, String phoneNo, String address) {
	  /*this.name = name;
		this.id = id;
		this.password = password;*/ 
		
		//생성자 안에서 생성자 호출 
		this(name, id, password);
		this.phoneNo = phoneNo;
		this.address = address;
	}

	/*public SubCriverInfo(String name, String id, String password, String phoneNo) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.phoneNo = phoneNo;
	} 생성자 역시 매개변수 타입 갯수가 같을경우에 오류가 발생함 */ 
	
	
	
}
