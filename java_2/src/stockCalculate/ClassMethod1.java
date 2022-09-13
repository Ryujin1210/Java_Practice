package stockCalculate;

public class ClassMethod1 {

	public static void main(String[] args) {
		GoodsStock obj;
		obj = new GoodsStock("52135", 200);
	//	obj.goodsCode = "52135";
	//	obj.stockNum = 200;
		System.out.println("code : " + obj.goodsCode);
		System.out.println("stockNum : " + obj.stockNum);
		obj.addStock(1000);
		System.out.println("code : " + obj.goodsCode);
		System.out.println("stockNum : " + obj.stockNum);
		  
	}

}
