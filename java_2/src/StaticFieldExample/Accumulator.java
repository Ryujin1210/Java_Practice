package StaticFieldExample;

public class Accumulator {
	int total = 0;
	static int grandTotal = 0; //Static Field : 정적 필드(변수)를 사용 
	
	void accumulate(int amount) {
		total += amount;
		grandTotal += amount;
	}
	
	static int getGrandTotal() {
		return grandTotal;
	}
}
