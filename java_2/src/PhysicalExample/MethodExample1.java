package PhysicalExample;

public class MethodExample1 {

	public static void main(String[] args) {
		PhysicalInfo obj;
		obj = new PhysicalInfo("이해리", 19, 157.8f, 45.6f);
		printPhysicalInfo(obj); 
		
		obj.update(20, 161.3f, 48.2f);		//upadate (int, float, float)
		printPhysicalInfo(obj);
		
		obj.update(21, 165.4f);				//update (int, float)
		printPhysicalInfo(obj);
		
		obj.update(22);						//update (int)
		printPhysicalInfo(obj);
	}
	
	static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름 : " + obj.name);
		System.out.println("나이 : " + obj.age);
		System.out.println("키 : " + obj.height);
		System.out.println("몸무게 : " + obj.weight);
		System.out.println();
	}

}
