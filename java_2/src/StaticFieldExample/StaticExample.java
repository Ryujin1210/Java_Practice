package StaticFieldExample;

public class StaticExample {

	public static void main(String[] args) {
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		
		obj1.accumulate(10);
		System.out.println("obj1.total = " + obj1.total);
		System.out.println("obj1.grandTotal = " + obj1.grandTotal);
		
		//모든 객체가 접근 하여 공유함. 
		obj2.accumulate(20);
		System.out.println("obj2.total = " + obj2.total);
		System.out.println("obj2.grandTotal = " + obj2.grandTotal);
		
		int grandTotal = Accumulator.getGrandTotal(); //정적 메서드 호출
		System.out.println(grandTotal);
	}

}
