/*
Author: Dylan Bartlett
Final Progect
*/
import java.util.Scanner; 
/**
 * <h1>Final Project</h1>
 * This program has you pick a list and then gives you a definition. Then you have to enter the word that fits the definition. The word gets checked and if it is correct it tell you and adds one to your score. 
 * 
 * @author Dylan Bartlett
 *Date : Dec 17, 2018
 */
public class finalProgect {
	/**
	 * This is the main and only method. First it splits up the lists, then it gives you the definitions and checks your answer and then prints out your score.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] array = {
			{"Plot", "Personification", "Characterization", "Point of view"},
			{"Conflict", "Alliteration", "Flat Character", "Omniscient"},
			{"Foreshadowing", "Allusion", "Round character", "First person limited"},
			{"Archetype", "Style", "Stereotype", "Third person limited"},
			{"Setting", "Tone", "Frame Story", "Objective"},
			{"Mood", "Diction", "Idioms", "Theme"},
			{"Simile", "Imagery", "Euphemism", "Symbol"},
			{"Metaphor", "Hyperbole", "Allegory", "Meme"}
		};
		String[][] definitions = {
			{"The sequence of events that happen in a story.", " An implied metaphor in which a non human subject takes on the qualities or attributes of a human.", "The act of creating or developing a character.", "The perspective or vantage point from which the writer tells the story."},
			{"The struggle between opposing forces or characters in a story, This can be internal or external.", "The repetition of beginning consonant sounds creating a musical effect.", "Has few or simple personality traits and does not change or learn anything from the events in the story.", "An all knowing narrator tells more about all the characters and events than any one character would know."},
			{"The use of hints and clues to suggest what will happen next.", "A reference to a well known person place event literary work or work of art.", "Has man or complex personality traits and learns and grows throughout the story.", "The narrator is a character in the story and uses i me or my but can only reveal his own thoughts or feelings."},
			{"A very old imaginative pattern that appears in literature across cultures and is repeated across the ages.", "A specific way of writing personal to each writer and their specific word choice", "One word description of a writer’s attitude toward his or her subject., and figurative language.", "An oversimplified idea about what a person or group of people are like.", "The narrator is not a character in the story and reveals only one character’s inner thoughts, and uses he she or they."},
			{"The time and location in which a story takes place.", "One word description of a writer’s attitude toward his or her subject.", "A story within a story.", "The narrator tells the story with ought telling anything about what the characters think or feel."},
			{"The atmosphere or overall emotion created by a work of literature.", "A speaker or writer’s choice of words.", "Figurative language in which a phrase has meaning that differs from the literal meaning.", "The central message or general insight into life that the author conveys in a story."},
			{"A figure of speech that makes a direct comparison between two unlike things using the words like or as.", "Descriptive language used in literature to re-create sensory experiences.", "An expression that softens reality.", "Anything that stands for or represents something else."},
			{"A figure of speech that makes a direct comparison between two unlike things WITHOUT using the words like or as.", "An incredible exaggeration or overstatement used for effect.", "A story that is meant to be read symbolically.", "A humorous image, video, piece of text, etc, that is copied and spread rapidly by Internet users."}
		};		
			System.out.println("To use this program you will need to select a list.");
			System.out.print("Please enter 1, 2, 3, or 4: ");
			int list = input.nextInt();
			input.nextLine();
		if (list < 5) {
			System.out.println("You have chosen list " + list + ". Lets get started!");
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
		
		if (list == 2) {
			for (int b = 0; b < 8; b++) {
				System.out.println(definitions[b][1] + " ");
				String answer2 = input.nextLine();
				
				if (answer2.equalsIgnoreCase(array[b][1])) {
					System.out.println("Correct!");
					potato++;
				}
				else {
					System.out.println("Incorrect.");
				}
			}
		}
					
		if (list == 3) {
			for (int c = 0; c < 8; c++) {
				System.out.println(definitions[c][2] + " ");
				String answer3 = input.nextLine();
				
				if (answer3.equalsIgnoreCase(array[c][2])) {
					System.out.println("Correct!");
					potato++;
				}
				
				else {
					System.out.println("Incorrect.");
				}
			}		
		}
		
		if (list == 4) {
			for (int c = 0; c < 8; c++) {
				System.out.println(definitions[c][3] + " ");
				String answer4 = input.nextLine();
				
				if (answer4.equalsIgnoreCase(array[c][3])) {
					System.out.println("Correct!");
					potato++;
				}
				
				else {
					System.out.println("Incorrect.");
				}
			}		
		}
		
		// print out score.
		System.out.println("Your score was " + potato + " out of 8.");
		
	}
}