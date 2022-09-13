package CircleExample1;

public class FieldExample2 {
	
	public static void main(String[] args) {
		Circle obj1 = new Circle(10);
		Circle obj2 = new Circle(20);
		Circle s;
		
		s = obj2;
		obj1 = obj2;
		
		System.out.println("obj1.radius" + obj1.radius);
		System.out.println("obj2.radius" + obj2.radius);
		System.out.println("s.radius" + s.radius);
		//같은 레퍼런스를 가르키며 전에 가르키던 주소는 가비지가 되어버림.
		System.gc();
		//가비지 컬렉션 작동 요청 메서드. !! 강제되지 않으며 요청에 불과 -> 자바 플랫폼이 전적으로 판단 후 수행.
	}
	
}
