package customException;

class Mythread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thred");
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {

		Mythread t = new Mythread();
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thred");
		}

	}

}
