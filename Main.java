import java.util.*;

public class Main {

    public static void main(String[] args) {

        StringManip manipulate = new StringManip();

        // Will store the string inputted by the user
        String toManip = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");

        toManip = scanner.nextLine();

        // Prints the available options for string manipulations
        System.out.println("What would you like to do with your sentence?");
        System.out.println("1: Reverse it!\n2: Alphabetize it!\n3: Count the letters!\n4: Count the words!\n5: Find the most common letter!");

        // Determines which option the user selects, and executes the chosen method
        switch(scanner.nextInt()){
            case 1:
                System.out.println("Here is your reversed sentence:\n" +
                        manipulate.reverse(toManip));
                break;
            case 2:
                System.out.println("Here is your alphabetized sentence:\n" +
                        manipulate.alphabetize(toManip));
                break;
            case 3:
                System.out.println("Here is the letter count of your sentence: " +
                        manipulate.letterCount(toManip));
                break;
            case 4:
                System.out.println("Here is the word count of your sentence: " +
                        manipulate.wordCount(toManip));
                break;
            case 5:
                System.out.println("The letter that occurs the most in your sentence is: " + manipulate.mostCommonChar(toManip));
                break;

            default:
                System.out.println("Please enter a valid option.");
                break;
        }


    }
}
