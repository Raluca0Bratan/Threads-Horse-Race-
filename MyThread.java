package horsePb;
/*
 * Each horse has 100 moves to make
 */
public class MyThread extends Thread {

	int index;
	int move = 0;

	public MyThread(int index) {
		this.index = index;
	}

	public void run() {

		for (int i = 1; i <= 100; i++) {
			this.move++;
			System.out.println("The horse with id " + this.index + " makes move " + this.move);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}
}
