public class MasterMind {

  private Master theMaster;
  private Player thePlayer;

  public MasterMind() {
    theMaster = new Master();
    thePlayer = new Player();
  }

  public void playGame() {
    System.out.println("WELCOME TO CODEBREAKER...Let's Play!\n");
    System.out.println("Guess a 4-letter code with letters A, B, C, and D\n");

    theMaster.createCode();

    while (true) {
      thePlayer.makeGuess();
      int x = theMaster.totalCorrect(thePlayer.getGuess());
      if (x == 4) {
        System.out.println("\nGOT IT!!\n");
        break;
      } else
        System.out.printf("MISSED! GOT %d out of 4.  PLEASE TRY AGAIN...\n", x);
    }
  }

}
