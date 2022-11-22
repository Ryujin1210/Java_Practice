package MultiTreadEx2;


public class MultiTreadEx2 {
	public static void main(String[] args) {
		Thread thread1 = new DigitThread();
		Thread thread2 = new DigitThread();
		Thread thread3 = new AlphabetThread();
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
class AlphabetThread extends Thread {
	@Override
	public void run() {
		super.run();
		for(char
				ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500L);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class DigitThread extends Thread {
	@Override
	public void run() {
		super.run();
		for(int cnt=0; cnt<10; cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}