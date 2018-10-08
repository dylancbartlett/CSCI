/*
Author: Dylan Bartlett
Date 10/4/18
*/

class Exercise_5_33  {
	public static void main(String[] args) {
		int z = 10000;
		boolean isPerfect = false;
		int i;
		for (i = 2; i <= z; i++) {
			isPerfect = isNumberperfect(i);
			if(isPerfect) {
				System.out.println(i + " is a perfect number.");
			}
		}
	}
	public static boolean isNumberperfect(int i) {
		boolean isPerfect = false;
		int sum = 1;
		int x;
		for (x = 2; x <= i / 2; x++) {
			if(i % x == 0) {
				sum += x;
			}
		}
		if (sum == i) {
			isPerfect = true;
		}
		return isPerfect;
	}
}