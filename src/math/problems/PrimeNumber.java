package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int a = 0;
		int num = 0;

		String primeNumbers = "";

		for (a = 1; a <= 1000000; a++) {

			int counter = 0;

			for (num = a; num >= 1; num--) {

				if (a%num == 0) {

					counter = counter + 1;
				}
			}
			if (counter==2) {

				primeNumbers = primeNumbers + a + "\n";

			}
			System.out.println("Prime numbers from 1 to 100 are :");

			System.out.println(primeNumbers);
		}
	}
}

