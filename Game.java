import java.util.Scanner;

public class Game {
    String hidden;
    String guess;
    String hint;
    String differentPosition;
    String notInWord;
    public static void main(String[] args) {
        Game game = new Game();
        game.run();
    }

    public void run() {
        Scanner kb = new Scanner(System.in);

        System.out.println("Player, guess a word of your choice.");
        hidden = kb.nextLine();
        System.out.println("Player, input a " + hidden.length() + " lettered word.");
        guess = kb.nextLine();

        hint = " ";
        differentPosition = "+";
        notInWord = "*";

        while(!hidden.equals(guess)) {
            for(int i = 0; i < hidden.length(); i++) {
                if(hidden.substring(i, i + 1).equals(guess.substring(i, i + 1))) {
                    hint = hint + guess.substring(i, i +1);
                }
                else if (guess.substring(i, i + 1).equals(hint)) {
                    hint = hint + differentPosition;
                }
                else {
                    hint = hint + notInWord;
                }
            }
            System.out.println(hint);
            System.out.println("Player, input another " + hidden.length() + " lettered word.");
            hint = " ";
            guess = kb.nextLine();
        }
        System.out.println("Congratulations, Player, you are correct.");

        //create while loop, runs while guess != hidden
        //create a local blank "" String to be concatenated to prep the hint
        //create for loop to parse through whole guess
        //check if letters in substring(i,i+1) match in both Strings (hidden and guess)
        //check if guess substring(i,i+1) exists somewhere indexOf(str) in the hidden
        //otherwise concatenate a *
        //print hint
        //repeat loop for new hint
    }

}
