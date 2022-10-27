package horsePb;
/*
 *  On the first run horse number 17 is the winner. But in general the winner is random.
	If the sleep period increases the results appear slower. But also the horses are at the same move or the difference between them is at most 1 move.
	If I increase the number of moves not all horses finish the race.
    
 * */
public class MainMoreThreads {

	public static void main(String[] args) {
		/*
		 *  The race of 20 horses
		 */
		Thread[] thread = new Thread[21];
		for (int i = 1; i <= 20; i++) {
			thread[i] = new MyThread(i);
		}
		for (int i = 1; i <= 20; i++) {
			thread[i].start();
		}
		for (int i = 1; i <= 20; i++) {
			try {
				thread[i].join();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}
