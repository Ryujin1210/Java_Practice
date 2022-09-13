package Banking;

public class Account {
	String accountNo; 	//계좌
	String ownerName;	//예금주
	int balance;		//잔고
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void desposit(int amount) {
		balance += amount;
	}
	
	int withdraw(int amount) throws Exception {
		if(balance < amount)	//잔액이 부족할 경우
			throw new Exception("잔액이 부족합니다.");// 예외 
		balance -= amount;
		return amount;
	}

}
