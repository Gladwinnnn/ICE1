public class ICE1_Q10{
    public static void main(String[] args){
        for (int i = 0; i < 3; i++){
            System.out.println("A"); 
            for (int j = 0; j < 3; j++){
                System.out.println("B");
                if (i == 1 || j == 1){
                    // break;
                    continue;
                }
                System.out.println("i: " + i + ", j: " + j); 
            }
            System.out.println("C"); 
        }
    }
}
