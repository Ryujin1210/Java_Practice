package HashMapExample;

public class Student {
	int id;
	String tel;

	Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}

	// getter 통해 id 호출
	public int getId() {
		return id;
	}

	public String getTel() {
		return tel;
	}

}
