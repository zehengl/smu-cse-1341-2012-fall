# lab-5

## Alpha Palindrome

In lab-2 you created a program that determines if a number is a palindrome.
For this lab, rewrite that program using letters instead of numbers.
Prompt for a word of any size, and determine if the word reads the same backwards and forwards.
Continue to prompt for additional words until the user enters `Q` to quit (using sentinel controlled repetition.)

**CAUTION**: String comparisons are case sensitive, so Kayak does not equal kayak. When running your program, just enter words with all caps or all lowercase.

You must include (and use) the following methods in your solution:

```
public static void main(String[] args)
public static String reverseIt(String theWord)
```

Sample Run

```
Enter word (Q to Quit) : mustang
mustang and gnatsum are not Palindromes
Enter word (Q to Quit) : kayak
kayak and kayak are Palindromes
Enter word (Q to Quit) : pool
pool and loop are not Palindromes
Enter word (Q to Quit) : Q
```

## Haiku Generator

Haiku is a Japanese poetic form, typically three lines of five syllables, seven syllables, and five syllables.

- Only three lines, totaling 17 syllables throughout.
- The first line must be only 5 syllables.
- The second line must be comprised of 7 syllables.
- The third line must be 5 syllables like the first.
- Punctuation and capitalization rules are up to the poet, and need not follow rigid rules used in structuring sentences.
- Haiku does not have to rhyme, and usually doesn't.
- Some haiku can include the repetition of words or sounds.

**TIP**: Devise some pattern (Line1 = "The" + one syllable adjective + one syllable noun + etc ...) and use it for all your poems.

Examples:

```
An old silent pond...
A frog jumps into the pond,
splash! Silence again
```

```
Political ads -
Require suspended thought
and thoughtless suspense.
```

```
sugar castle melts
moat of cream, black coffee rain
pie completes my dream
```

Your assignment is to create a Java program that generates Haikus from randomly selected words from arrays containing one and two syllable nouns, verbs, and adjectives.
Use random numbers to randomly select words and construct a three line Haiku with 5-7-5 syllables

Create arrays that each contain at least ten words of your choosing. The six arrays should contain the following contents:

1. One syllable nouns.
2. Two syllable nouns.
3. One syllable adjectives.
4. Two syllable adjectives.
5. One syllable verbs.
6. Two syllable verbs.

Use random numbers to select random words from each of your arrays and construct a random Haiku.
Remember that it is poetic and won't read like grammatically correct prose.
Just make sure you have five syllables on the first and third lines, and seven syllables on the second line.
After displaying the Haiku, prompt the user for more (`Y` or `N`) and continue generating new Haikus until they reply with `N`.

Sample Run:

```
WANT A HAIKU? (Y/N) : Y

The strange dog sleeping
amorous moldy food
Yes! old dog walking

WANT A HAIKU? (Y/N) : Y

The wet boy sleeping
wonderful artful pet
No! hot dog crawling

WANT A HAIKU? (Y/N) : Y

The old cat driving
amorous oozing thing
Darn! strange girl sleeping

WANT A HAIKU? (Y/N) : N

I hope you enjoyed the Haiku!
```

## Alpha Code Breaker

Copy the contents of your AlphaCodeMaker class from previous lab (lab-4) and create a new class named `AlphaCodeBreaker`.
Reuse and modify the code you developed from `AlphaCodeMaker` and `CodeBreaker`.
Be sure to remove logic that displays the code to keep it hidden from the player.
Add behavior to prompt a player to enter a `guess` and compare the guess to the hidden code.

Include (and use) the following method signatures:

```
public static void main(String[] args)
public static char[] getCode()
public static void displayCode(int[] passedArray)
public static char[] getGuess()
public static boolean compare(char[] theCode, char[] theGuess)
```

**Error Handling**:
When the user enters a four letter code, you must report an error and force reentry of the value if any of the following conditions occur:

- The user enters fewer than four letters
- The user enters more than four letters
- Any of the four letters are not A, B, C, or D

Sample Run

```
WELCOME TO CODEBREAKER...Let's Play!

Guess a 4-letter code with letters A, B, C, and D

YOUR GUESS=> ABBCD
Too long!
INVALID TRY - PLEASE GUESS AGAIN!!
YOUR GUESS=> ABBE
Fourth letter must be A, B, C, or D
INVALID TRY - PLEASE GUESS AGAIN!!
YOUR GUESS=> FAAA
First letter must be A, B, C, or D
INVALID TRY - PLEASE GUESS AGAIN!!
YOUR GUESS=> AAAA
Guessed 0 out of 4

MISSED! PLEASE TRY AGAIN...

YOUR GUESS=> BBBB
Guessed 1 out of 4

MISSED! PLEASE TRY AGAIN...

YOUR GUESS=> ABBB
Guessed 0 out of 4

MISSED! PLEASE TRY AGAIN...

YOUR GUESS=> CBBB
Guessed 0 out of 4

MISSED! PLEASE TRY AGAIN...

YOUR GUESS=> DBBB
Guessed 0 out of 4

MISSED! PLEASE TRY AGAIN...

YOUR GUESS=> BBBB
Guessed 1 out of 4

MISSED! PLEASE TRY AGAIN...

YOUR GUESS=> BCBB
Guessed 2 out of 4

MISSED! PLEASE TRY AGAIN...

YOUR GUESS=> BCDC

GOT IT!!
```

---

## Compile and Run

### AlphaPalindrome

    javac AlphaPalindrome.java
    java AlphaPalindrome

### HaikuMaker

    javac HaikuMaker.java
    java HaikuMaker

### AlphaCodeBreaker

    javac AlphaCodeBreaker.java
    java AlphaCodeBreaker
