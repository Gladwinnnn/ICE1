import java.util.*;

public class ICE1_Q2{
    public static void main(String[] args){
        char firstChar;
        char secondChar;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first word:");
            String firstWord = scanner.nextLine();
            firstChar = firstWord.charAt(0);
            System.out.print("Enter second word:");
            String secondWord = scanner.nextLine();
            secondChar = secondWord.charAt(0);
            if (firstChar != secondChar){
                System.out.println("try again");
            }
        }
        while (firstChar != secondChar);
        System.out.print("Bingo");
    }

    // Second Method
    /* 
    public static void main(String[] args){
        char firstChar;
        char secondChar;
        boolean condition = false;
        
        while (!condition){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first word:");
            String firstWord = scanner.nextLine();
            firstChar = firstWord.charAt(0);
            System.out.print("Enter second word:");
            String secondWord = scanner.nextLine();
            secondChar = secondWord.charAt(0);
            if (firstChar != secondChar){
                System.out.println("try again");
            } else {
                condition = true;
            }
        }
        
        System.out.print("Bingo");
    }
    */
}