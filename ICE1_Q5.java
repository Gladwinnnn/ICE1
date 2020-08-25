import java.util.*;

public class ICE1_Q5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size:");
        int size = scanner.nextInt();

        // Part (A)
        char[] letterArray={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int index = 0;
        for (int i = 0; i < size; i++){
            if (i == letterArray.length){
                index = 0;
            }
            System.out.print(letterArray[index] + " ");
            index ++;
        }
        System.out.println();

        // Part (B)
        for (int j = 0; j < size; j++){
            System.out.print((j+1) + "" + (j+2) + "" + (j+3) + " ");
        }
        System.out.println();

        // Part (C)
        String number = "1";
        int cont = 2;
        for (int k = 0; k < size; k++){
            System.out.println(number);
            number += cont;
            cont++; 
        }
    }
}