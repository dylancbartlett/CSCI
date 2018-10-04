/*
Author: Dylan Bartlett
Date: 10/1/18
*/

class exercise_5_11 {
	public static void main(String[] args) {
		
		int x = 100;
		int counter = 0;
		while (x < 200){
			if (x % 5 == 0 && x % 6 > 0){
				System.out.print(x + " ");
				counter = counter + 1;
			}
			if (x % 6 == 0 && x % 5 > 0){
				System.out.print(x + " ");
				counter = counter + 1;
			}
			x = x + 1;
			if (counter % 10 == 0){
						System.out.println();
			}
		}
	}
}