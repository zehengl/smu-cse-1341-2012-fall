# lab-4

Mastermind has been a popular game for over 30 years.
The `code maker` hides four colored pegs (duplicates are allowed), which the `code breaker` must guess.
The code breaker must correctly guess the correct colored peg in each of the four slots.
After a guess, the code maker reports how many correct colors were in the correct slot, and additionally, how many of the correct colors were in the wrong slot.
For this lab, we are going to create a simplified version of the game.

First, we will start by using one digit numbers instead of colors, so comparing guesses with the correct code can be accomplished with a simple comparison operation. Also, in our game, the code maker will only report the correct number of digits that are in the correct slot.

## Code Maker

Create a class named `CodeMaker` that creates a four digit code, where each of the digits can contain the values 1, 2, 3, or 4.
You should have three methods: `main`, `getCode`, and `displayCode`.

The main method is given below.
The getCode method should generate four random numbers in the range 1 through 4.
The displayCode method should print the code out to the console.

The content of the main method is shown below, as well as the method signatures for the other two methods, and fill in the rest of the contents of the class that will create the output shown below. Each time you run the program, it should display a randomly generated four digit code.

`main` method contents:

```java
public static void main(String[] args) {
  int[] code = getCode();
  displayCode(code);
}
```

Additional method signatures:

```
public static int[] getCode()
public static void displayCode(int[] passedArray)
```

Sample Run:

```
1 1 4 1
```

## Alpha Code Maker

Write another version of the previous program called `AlphaCodeMaker`.
Instead of a four digit code, it should generate a four letter code using a random selection of the letters A, B, C, and D.
You must use the main method provided below.
Create the additional methods and logic required to get the output as shown in the sample below.
Note the use of char arrays.

`main` method contents:

```java
public static void main(String[] args) {
  char[] code = getCode();
  displayCode(code);
  System.out.println();
}
```

Sample Run:

```
A D D C
```

## Code Breaker

Copy the contents of your `CodeMaker` class from above and create a new class named `CodeBreaker`.
Reuse the code you developed that creates a four digit code, but remove the display of that code to keep it hidden from the player.
Add behavior to prompt a player to enter a `guess` and compare the guess to the hidden code.
For this problem, you should use the main method provided below, as well as the remaining method signatures.
You should complete the code within the remaining methods to match the behavior in the sample output shown below.

`main` method contents:

```java
public static void main(String[] args) {
  System.out.println("WELCOME TO CODEBREAKER...Let's Play!\n");
  System.out.println("Guess a 4-digit code with digits 1, 2, 3, and 4\n");

  int[] code = getCode();

  boolean solved = false;
  while (solved == false) {
    int[] guess = getGuess();
    solved = compare(code, guess);
    if (solved) {
      System.out.println("\nGOT IT!!\n");
      break;
    } else
      System.out.println("\nTRY AGAIN...\n");
  }
}
```

Additional methods:

```
public static int[] getCode()
public static int[] getGuess()
public static boolean compare(int[] theCode, int[] theGuess)
```

Sample Run：

```
WELCOME TO CODEBREAKER...Let's Play!

Guess a 4-digit code with digits 1, 2, 3, and 4

Guess : 1111
Guessed 2 out of 4

TRY AGAIN...

Guess : 1321
Guessed 1 out of 4

TRY AGAIN...

Guess : 1312
Guessed 0 out of 4

TRY AGAIN...

Guess : 2131
Guessed 3 out of 4

TRY AGAIN...

Guess : 2141
Guessed 2 out of 4

TRY AGAIN...

Guess : 2131
Guessed 3 out of 4

TRY AGAIN...

Guess : 4131

GOT IT!
```

---

## Compile and Run

### CodeMaker

    javac CodeMaker.java
    java CodeMaker

### AlphaCodeMaker

    javac AlphaCodeMaker.java
    java AlphaCodeMaker

### CodeBreaker

    javac CodeBreaker.java
    java CodeBreaker
