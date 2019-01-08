# Definition Test

## Synopsis
The program is a definition test. When the program is ran it will give a printout asking the user what list they would like. After you enter a list it will proceed to give the test. After the test is over it will print out a score.

## Motivation
This progect was created for an into to programming class. I chose to do this specific progect because when I was younger I didnt have a very large vocabulary. This made it hard when writting becuase i didnt know what words to use, so I created this progect to help people learn some simple definitions. 

## How to Run
When the program is ran it will give a printout asking the user what list they would like. After you enter a list it will proceed to give the test where you will enter the word that matches the definition. After the test is over it will print out a score.

## Code Example
This section of code will prompt the user and then check to make sure they enter a number in the peramiters. the second section of the code actually runs list one so you can take the test.
```

System.out.println("To use this program you will need to select a list.");
			System.out.print("Please enter 1, 2, 3, or 4: ");
			int list = input.nextInt();
			input.nextLine();
		if (list < 5) {
			System.out.println("You have chosen list " + list + ". Let's get started!");
		}
		else {
			System.out.println("This is not an option.");
//separate lists 
		}
		int potato = 0;
		if (list == 1) {
			for (int a = 0; a < 8; a++) {
				System.out.println(definitions[a][0] + " ");
				String answer1 = input.nextLine();
				
				if (answer1.equalsIgnoreCase(array[a][0])) {
					System.out.println("Correct!");
					potato++;
				}
				
				else {
					System.out.println("Incorrect.");
				}
			}
		}

```
