package threadsunterbrechen;

import java.util.Scanner;

public class ThreadsUnterbrochen {

	public static void main(String[] args) {

		ThreadsErstellen tu = new ThreadsErstellen();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		tu.start();

		if (n == 0) {

			tu.interrupt();
			System.out.println("Der Thread wurde unterbrochen.");

		}

	}

}
