package NumbersAverage;

public class MethodExamople1 {

	public static void main(String[] args) {
		int arr[] = {10, 20, 30 ,40 ,50 ,60, 70, 80, 90, 100};
		Numbers obj = new Numbers(arr);
		
		int total = obj.getTotal();
		double average = obj.getAverage();
		
		System.out.println("합계는 : "+ total);
		System.out.println("평균은 : "+ average);
	}

}
