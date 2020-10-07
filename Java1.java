package Java_week1;


/**
 * Java1
 */
import java.util.Scanner;


public class Java1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Mad lib");
        System.out.println("How old are you?");
        int age = Integer.parseInt(input.nextLine()) ;
       
        if (age>=18){

            System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Give me an adverb!");
        String adverb = input.nextLine();
        System.out.println("Give me an adjective!");
        String adjective = input.nextLine();
        System.out.println("Give me a noun!");
        String noun1 = input.nextLine();
        System.out.println("Give me another noun!");
        String noun2 = input.nextLine();
        System.out.println("Give me a number!");
        String number = input.nextLine();
        String message = "Richie";
        System.out.printf("Dear %s,\n You are %s %s and I want to be you %s! I want to go to the %s with you in %s days.\n Sincerely, %s", name,adverb,adjective,noun1,noun2,number, message);
        }
        else {
            System.out.println("You are not old enough");
        }
        
        

    }
}