package quickcoding05;

public class testMain {

	public static BankAccount account = new BankAccount();

	public static void main(String[] args) {

		Thread depositMan = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					account.add(10);
					try {
						sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

			// 뭔가 들어가야 함

		};
		Thread withdrawMan = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 50; i++) {
					account.delete(10);
					try {
						sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		};

		depositMan.start();

		withdrawMan.start();
	}
}
