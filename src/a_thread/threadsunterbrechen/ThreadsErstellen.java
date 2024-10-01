package threadsunterbrechen;

public class ThreadsErstellen implements Runnable {

	Thread t;

	public ThreadsErstellen() {

		t = new Thread(this);

	}

	@Override
	public void run() {

		System.out.println("Der Thread wurde gestartet.");

		for (int i = 0; i < 100; i++) {

			System.out.println(i + "s");

			if (t.isInterrupted()) {

				break;

			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				t.interrupt();
				e.printStackTrace();
			}

		}

	}

	public void start() {

		t.start();

	}

	public void interrupt() {

		t.interrupt();

	}

}
