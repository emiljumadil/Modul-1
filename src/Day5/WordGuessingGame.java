//package Day5;
//import java.util.Scanner;
//
//public class WordGuessingGame {
//    private String wordToGuess;
//    private String hiddenWord;
//    private int maxAttempts;
//    private int attemptsLeft;
//
//    public WordGuessingGame(String wordToGuess, int maxAttempts) {
//        this.wordToGuess = wordToGuess.toLowerCase();
//        this.maxAttempts = maxAttempts;
//        this.attemptsLeft = maxAttempts;
//        this.hiddenWord = wordToGuess;
//
//    }
//    public void initializeGame() {
//        System.out.println("Welcome to the Word Guessing Game!");
//        System.out.println("You have " + maxAttempts + " attempts to guess the word.");
//        System.out.println("The word to guess is: " + hiddenWord);
//    }
//    public void promptGuess() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your guess (single letter): ");
//        String guess = scanner.nextLine().toLowerCase();
//
//        if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
//            System.out.println("Invalid input. Please enter a single letter.");
//            return;
//        }
//
//        checkGuess(guess.charAt(0));
//    }
//
//    private void checkGuess(char guess) {
//        if (wordToGuess.indexOf(guess) >= 0) {
//            System.out.println("Correct guess!");
//
//        } else {
//            System.out.println("Incorrect guess.");
//            attemptsLeft--;
//        }
//        System.out.println("Attempts left: " + attemptsLeft);
//        System.out.println("Current word: " + hiddenWord);
//
//        if (hiddenWord.equals(wordToGuess)) {
//            System.out.println("Congratulations! You've guessed the word!");
//        } else if (attemptsLeft <= 0) {
//            System.out.println("Game over. The word was: " + wordToGuess);
//
//
//            StringBuilder updatedWord = new StringBuilder(hiddenWord);
//            for (int i = 0; i < wordToGuess.length(); i++) {
//                if (wordToGuess.charAt(i) == guess) {
//                    updatedWord.setCharAt(i, guess);
//                }
//            }
//            hiddenWord = updatedWord.toString();
//        }
//        public void play() {
//            initializeGame();
//            while (attemptsLeft > 0 && !hiddenWord.equals(wordToGuess)) {
//                promptGuess();
//            }
//        }
//            private static void main(String[]args){
//
//                WordGuessingGame game = new WordGuessingGame("java", 5);
//                game.play();
//            }
//        }
//
//            private void play() {
//    }
//}
