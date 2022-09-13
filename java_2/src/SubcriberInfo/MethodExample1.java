package SubcriberInfo;

public class MethodExample1 {

	public static void main(String[] args) {
		SubCriverInfo obj1, obj2;
		obj1 = new SubCriverInfo("연흥부", "Poorman", "zebi");
		obj2 = new SubCriverInfo("연놀부", "Richman", "money", "010-1234-5678", "타워팰리스");
		
		printSubsCriberInfo(obj1);
		printSubsCriberInfo(obj2);
		
		SubCriverInfo obj;
		obj = new SubCriverInfo();
		printSubsCriberInfo(obj);
	
	}
	
	static void printSubsCriberInfo(SubCriverInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("아이디 : " + obj.id);
		System.out.println("패스워드 : " + obj.password);
		System.out.println("전화번호 : " + obj.phoneNo);
		System.out.println("주소 : " + obj.address);
		System.out.println();
	}
	
	

}
