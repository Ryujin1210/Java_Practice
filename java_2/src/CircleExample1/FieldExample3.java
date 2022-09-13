package CircleExample1;

public class FieldExample3 {

	public static void main(String[] args) {
		Circle[] c;  //객체 배열 사용하기
		c = new Circle[5]; //객체 생성이 아니고 객체 배열 레퍼런스.
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i); // 각각 객체 생
			System.out.println(c[i].getArea());
		}
		
		
	}

}
