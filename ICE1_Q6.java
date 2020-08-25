import java.util.ArrayList;

public class ICE1_Q6{
    public static boolean alignString(String str1, String str2){
        ArrayList<Integer> intArray1 = new ArrayList<Integer>();

        int index = 0;
        for (int i = 0; i < str1.length(); i++){
            if (index < str2.length()){
                intArray1.add(str1.lastIndexOf(str2.substring(index, index + 1)));
            }
            index++;
        }

        // handling the situation where no alignment is possible
        for (int i = 0; i < intArray1.size(); i++){
            if (intArray1.get(i) == -1){
                return false;
            }
        }

        for (int i = 0; i < intArray1.size() - 1; i++){
            if (intArray1.get(i) > intArray1.get(i + 1)){
                return false;
            }
        }
        // end of no alignment possible situation

        System.out.println(str1);

        int index2 = 0;
        for (int i = 0; i < str1.length(); i++){
            if (index2 < intArray1.size() && i == intArray1.get(index2)){
                System.out.print(str1.substring(i, i + 1));
                index2++;
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
        return true;
    }
    public static void main(String[] args){
        alignString("Java Programming Course", "amg");  // prints alignment and return true
        alignString("Recess Week", "RcWk");             // prints alignment and return true
        alignString("Recess Week", "a");                // doesn't print alignment
    }
}