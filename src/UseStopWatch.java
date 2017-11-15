public class UseStopWatch {
	public static void main(String[] args) {
		int totalPrimeNumber = 30000;

		StopWatch stopWatch = new StopWatch();
		stopWatch.setStart(System.nanoTime());

		isPrimeBad(totalPrimeNumber);

		stopWatch.setEnd(System.nanoTime());

		long timeElapsed = stopWatch.getElapsedTime();

		System.out.printf("%s %d %s \n", "Tid for å finne 30000 primtall med isPrimeBad er ", timeElapsed,
				"nanosekunder");

		stopWatch.setStart(System.nanoTime());

		isPrimeGood(totalPrimeNumber);

		stopWatch.setEnd(System.nanoTime());
		timeElapsed = stopWatch.getElapsedTime();

		System.out.printf("%s %d %s \n", "Tid for å finne 30000 primtall med isPrimeGood er ", timeElapsed,
				"nanosekunder");

	}

	private static void isPrimeBad(long totalPrime) {
		int count = 0;
		int number = 0;
		while (count < totalPrime) {
			if (isPrimeBad2(number)) {
				count++;
			}	
			number++;
		}
	}

	private static boolean isPrimeBad2(int number) {
		for (long j = 2; j <= number / 2; j++) {
			if (number % j == 0)
				return false;
		}

		return true;
	}

	private static void isPrimeGood(int totalPrime) {
		int count = 0;
		int number = 0;
		while (count < totalPrime) {
			if (checkIfNumberIsPrime(number)) {
				count++;
			}
			number++;
		}

	}

	private static boolean checkIfNumberIsPrime(int number) {
		if (number > 2 && (number & 1) == 0)
			return false;
		for (long j = 2; j * j <= number; j += 2) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}
}

class StopWatch {
	private long startTime;
	private long endTime;

	public void setStart(long start) {
		startTime = start;
	}

	public void setEnd(long end) {
		endTime = end;
	}

	public long getElapsedTime() {
		return endTime - startTime;

	}

}
