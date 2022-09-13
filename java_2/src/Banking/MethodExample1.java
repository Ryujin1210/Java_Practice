package Banking;

public class MethodExample1 {
		
	public static void main(String[] args) {
		Account obj1 = new Account("111-22-333333", "강새벽", 200000);
		Account obj2 = new Account("444-55-666666", "오일남", 1000000);
		
		obj1.desposit(10000);
		
		try {
		//예외처리 try catch 
		obj2.withdraw(1100000);
		} catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		printAccount(obj1);
		printAccount(obj2);
	}
	
	static void printAccount(Account obj) {
		System.out.println("예금주 이름 : " + obj.ownerName);
		System.out.println("계좌번호 : " + obj.accountNo);
		System.out.println("잔액 : " + obj.balance);
		System.out.println();
	}
}
