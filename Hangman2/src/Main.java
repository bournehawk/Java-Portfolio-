/*  Name:   Sarah Hulcy
    Class:  MSITM 6340
    Date:   
 */

import jdk.nashorn.api.tree.WhileLoopTree;

import java.util.Scanner;
import java.util.Random;


public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Welcome to hangman");
        System.out.println("------------------");
        //sentences to be pulled for user to guess
        String[] randomSentenceList =
                {
                        "A hamburger swung underneath a staircase",                            // 1
                        "The toaster scratched the sickly snake",                              // 2
                        "The tall woman insulted the purple butterfly",                        // 3
                        "The aged cheetah skipped through an elevator",                        // 4
                        "A lactose intolerant librarian swam into a flower bed",               // 5
                        "A persnickety telephone parachuted over an elevator",                 // 6
                        "The seamstress intentionally tickled a fighter jet",                  // 7
                        "A tiger strolled over a textbook",                                    // 8
                        "A mouse harmoniously decimated a coffee pot",                         // 9
                        "The Pokemon trainer ate a polite bulldozer",                          // 10
                        "The polka dotted monkey tiptoed above the bike rack",                 // 11
                        "An obese botanist slapped the polite bench",                          // 12
                        "The annoying boy mocked a praying mantis",                            // 13
                        "A milkshake parachuted beyond the escalator",                         // 14
                        "A young astronaut vomited all over a computer",                       // 15
                        "A Pokemon trainer stupidly tricked a surgeon",                        // 16
                        "The gorilla patted the joyful chemical engineer",                     // 17
                        "The bear bounced in the train",                                       // 18
                        "A gnome bicycled along the floor",                                    // 19
                        "An unicorn carefully tackled a sickly cricket"                        // 20
                };
        // Hints sent to user that match to the number on the sentence.
        String[] randomHint =
                {
                        "Elevated food.",                                                       // 1
                        "Taste like chicken, makes Pop-Tarts",                                  // 2
                        "Sasquatch went rogue",                                                 // 3
                        "Animal on the loose where you stay",                                   // 4
                        "Dairy runs in the beds",                                               // 5
                        "Sky high phone call",                                                  // 6
                        "Tickle fight",                                                         // 7
                        "Killer books",                                                         // 8
                        "Small things smell like Folgers",                                      // 9
                        "Got to Catch'em All at a construction site",                           // 10
                        "Jedimonky owns a bike",                                                // 11
                        "Working with flowers can be a bench",                                  // 12
                        "Just because they praying no need to be mocked",                       // 13
                        "Chocolate Milk, Shaken not stirred",                                   // 14
                        "Zero G's can surely make your mouse sick",                             // 15
                        "Got to Catch'em All in a hospital",                                    // 16
                        "Aping around with the chemicals",                                      // 17
                        "Who let the bear's on",                                                // 18
                        "Can you reach the pedals",                                             // 19
                        "Mystical creatures can still take you down"                             // 20
                };

        String[] guesses;

        Scanner input = new Scanner(System.in);

        int sentenceToGuess = getRandomString(randomSentenceList);

        String finalSentence = randomSentenceList[sentenceToGuess];

        String finalHint = randomHint[sentenceToGuess];

        boolean[] lettersGuessed = new boolean[finalSentence.length()];

        boolean userWon = false;

        int strikes = 3;

        while(!userWon && strikes > 0)
        {
            printCurrentBoard(finalSentence, lettersGuessed, finalHint);
            System.out.println("What letter do you guess?");
            char l = input.next().charAt(0);

            //What is said if they Win or Lose.
            if (checkGuess(l,finalSentence,lettersGuessed))
            {
                if(hasGuessedWord(lettersGuessed))
                {
                    System.out.println("YOU WIN!");
                    System.out.println("The word was: " + finalSentence);
                    userWon = true;
                }

            }
            else
            {
                System.out.println("That is incorrect!");
                --strikes;
                System.out.println("Number of misses left: " + strikes);

            }

        }
        if (strikes == 0)
            System.out.println("You Lose Unicorn");

    }


    //generates random number for the sentence
    public static int getRandomString(String[] stringList)
    {
        int rndsent = new Random().nextInt(stringList.length);
        return rndsent;
    }

// checks the guess for the user
    private static boolean checkGuess(char guess, String word, boolean[] correctlyGuessedLetters)
    {

        boolean guessedCorrectly = false;
        char lowerGuess = (Character.toLowerCase(guess));

        for(int i = 0; i<word.length();i++)
        {
            if (Character.toLowerCase(word.charAt(i)) == lowerGuess)
            {
                correctlyGuessedLetters[i] = true;
                guessedCorrectly = true;
            }
        }

        return guessedCorrectly;
    }

//prints the board to the user
    private static void printCurrentBoard(String word, boolean[] correctlyGuessedLetters, String hint)
    {
        for (int i = 0; i<word.length();i++)
        {
            if (correctlyGuessedLetters[i] == true)
            {
                System.out.print(word.charAt(i));
            }
            else if (correctlyGuessedLetters[i] == false && word.charAt(i) == ' ')
            {
                System.out.print(" ");
                correctlyGuessedLetters[i] = true;
            }
            else if (correctlyGuessedLetters[i] == false && word.charAt(i) == '.')
            {
                System.out.print("'");
            }
            else
                System.out.print("*");
        }

        System.out.printf("%n");
        System.out.println(hint);
    }

// checks the word is correctly
    private static boolean hasGuessedWord(boolean[] correctlyGuessedLetters)
    {
        for (int i = 0; i < correctlyGuessedLetters.length; i++)
        {
            if(correctlyGuessedLetters[i] == false)
            {
                return false;
            }
        }
        return true;
    }


}


