import java.util.*;

public class ICE1_Q8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        int number = scanner.nextInt();
        int number2 = number;
        String binary = "0";

        while (number > 0){
            binary += number % 2;
            number /= 2;
        }
        String result = "";
        for (int i = binary.length()-1; i > 0; i --){
            result += binary.charAt(i);
        }
        System.out.println("Binary equivalent of " + number2 + " is " + result);
    }
}