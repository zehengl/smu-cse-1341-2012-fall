import java.util.Scanner;

public class AlphaPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("\nEnter word (Q to Quit) : ");
			String word = s.next();
			if (word.equals("Q"))
				break;

			String reversed = reverseIt(word);

			if (word.equals(reversed))
				System.out.printf("%s and %s are Palindromes", word, reversed);
			else
				System.out.printf("%s and %s are not Palindromes", word, reversed);
		}

	}

	public static String reverseIt(String theWord) {
		char[] letters = theWord.toCharArray();
		char[] reversed = new char[letters.length];

		int c = 0;

		for (int i = letters.length - 1; i >= 0; i--) {
			reversed[c] = letters[i];
			c++;
		}

		String reversedWord = new String(reversed);
		return reversedWord;
	}

}
