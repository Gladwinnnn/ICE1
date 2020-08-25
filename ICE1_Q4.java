import java.util.*;
import java.util.ArrayList;

public class ICE1_Q4{
    public static void main(String[] args){
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        int number;

        do{        
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number:");
            number = scanner.nextInt();
                numberArray.add(number);
        }
        while (number >= 0);

        int product = numberArray.get(0);
        if (product < 0){
            System.out.print("No positive number is entered");
        }
        else{
            System.out.print(numberArray.get(0));
            for(int i = 1; i < numberArray.size(); i++){
                if (numberArray.get(i) >= 0){
                    product *= numberArray.get(i);
                    System.out.print(" x " + numberArray.get(i));
                }
            }
            System.out.print(" = " + product);
        }
    }
}