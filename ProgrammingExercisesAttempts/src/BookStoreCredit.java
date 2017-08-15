//import statement
import java.util.Scanner;

public class BookStoreCredit {

    //main method making the score variable to be passed
    public static void main(String[] args) {
        float score;
        System.out.println("Please enter your score: ");
        Scanner input = new Scanner(System.in);
        score = input.nextFloat();
        displayCredit(score);
    }

    //uses passed score and calculates score credit
    public static void displayCredit(float result){
        float credit;
        System.out.println("Your Bookstore credit is:");
        credit = result * 10;
        System.out.println("$" + credit);
    }
}
