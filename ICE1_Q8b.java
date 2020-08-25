import java.util.*;
import java.util.ArrayList;

public class ICE1_Q8b{
    public static void main(String[] args){
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text message:");
        String message = scanner.nextLine();
        for (int i = 0; i < message.length(); i++){
            numberArray.add((int)message.charAt(i));
        }

        for (int i = 0; i < numberArray.size(); i++){
            int temp = numberArray.get(i);
            String binary = "0";

            while (temp > 0){
                binary += temp % 2;
                temp /= 2;    
            }

            String result = "";
            for (int j = binary.length() - 1; j > 0; j --){
                result += binary.charAt(j);
            }

            if (result.length() < 8){
                for (int k = 0; k < 8 - result.length() + 1; k++){
                    result = '0' + result;
                }
            }
            System.out.print(result);
        }
    }
}