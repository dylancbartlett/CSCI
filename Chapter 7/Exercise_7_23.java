/*
Author Dylan Bartlett
Date 11/2/18
*/

class Exercise_7_23 {
	public static void main(String[] args) {
		boolean[] lockers = new boolean[100];
		
		for (int i = 0; i < 100; i++) {
			lockers[i] = false;
		}
		//loops through 100 students
		for (int i = 1; i <= 100; i++) {
			//open/close lockers
			for (int j = i - 1; j < 100; j += i) {
				lockers[j] = !lockers[j];
			}
		}
		for (int i = 1; i < 100; i++) {
			if (lockers[i]) {
				System.out.println("locker " + (i + 1) + " is open");
			}
		}
	}
}