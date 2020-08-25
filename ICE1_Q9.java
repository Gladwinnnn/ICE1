public class ICE1_Q9{
    public static void main(String[] args){
        char c = 'a'; 
        int age = 9; 

        // fragment A 
        if (c == 'a' && ++age == 10){
            age++; 
        } 
        System.out.println(age);    // 11

        // fragment B
        if (c == 'a' & ++age == 10){
            age++; 
        } 
        System.out.println(age);    // 11

        // fragment C
        if (c != 'a' && ++age == 10){
            age++; 
        } 
        System.out.println(age);    // 9

        // fragment D
        if (c != 'a' || ++age == 10){
            age++; 
        } 
        System.out.println(age);    // 10

        // fragment E
        if (c == 'a' || ++age == 10){
            age++; 
        } 
        System.out.println(age);    // 10

        // fragment F
        if (c != 'a' | ++age == 10){
            age++; 
        } 
        System.out.println(age);    // 11
    }
}