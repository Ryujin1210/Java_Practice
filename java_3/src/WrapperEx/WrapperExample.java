package WrapperEx;

public class WrapperExample {

	public static void main(String[] args) {
		// Integer obj1 = Integer.valueOf(12345);
		// Double obj2 = Double.valueOf(1.00005);
		// int i = obj1.intValue();
		// double d = obj2.doubleValue();

		// auto boxing and unboxing 자동처리
		Integer obj1 = 12345;
		Double obj2 = 1.00005;

		int i = obj1;
		double d = obj2;

		System.out.println(i);
		System.out.println(d);

	}

}
