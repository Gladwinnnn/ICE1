import java.util.ArrayList;
import java.util.*;

public class ICE1_Q3{
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence:");
        String sentence = scanner.nextLine() + " ";
        String placeHolder = "";
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' '){
                words.add(placeHolder);
                placeHolder = "";
            }
            else{
                placeHolder += sentence.charAt(i);
            }
        }
        
        Collections.reverse(words);
        for (String s : words){
            System.out.print(s + " ");
        }
    }

    // Second Method
    /*
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence:");
        String sentence = scanner.nextLine() + " ";
        String[] arrayOfString = sentence.split(" ");
        
        for (int i = arrayOfString.length-1; i > -1; i--){
            System.out.print(arrayOfString[i] + " ");
        }
    }
    */
}