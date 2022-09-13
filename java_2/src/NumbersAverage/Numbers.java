package NumbersAverage;

public class Numbers {
	int num[];
	
	Numbers(int[] num) {
		this.num = num;
	}

	int getTotal() {
		int total = 0;
		for (int cnt=0; cnt<num.length; cnt++) {
			total += num[cnt];
		}
		return total;
	}
	
	double getAverage() {
		int total;
		total = getTotal();		//다른 메서드 사용 가
		double average = (double) total / num.length;
		
		return average;
	}
	
}
