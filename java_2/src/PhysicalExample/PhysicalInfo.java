package PhysicalExample;

public class PhysicalInfo {
	String name;
	int age;
	float height, weight;
	
	public PhysicalInfo(String name, int age, float height, float weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//메소드의 이름은 같지만 매개변수와 타입 갯수에 따라 다름 -> 메서드 오버로
	void update(int age) {
		this.age = age;
	}
	
	void update(int age, float height) {
		this.age = age;
		this.height = height;
	}
	
	void update(int age, float height, float weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
}
