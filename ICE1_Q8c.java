import java.util.*;
import java.util.ArrayList;

public class ICE1_Q8c{
    public static void main(String[] args){
        ArrayList<String> numberArray = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary message:");
        String message = scanner.nextLine();

        int index = 8;
        for (int i = 0; i < message.length(); i += 8){
            numberArray.add(message.substring(i,index));
            index += 8;
        }
        
        for (String words : numberArray){
            System.out.print((char)Integer.parseInt(words,2));
        }
    }
}