public class ICE1_Q1{
    public static int sumOfDigits(int number){
        int sum = 0;
        number = Math.abs(number);
        
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumOfDigits(-354));
        System.out.println(sumOfDigits(123));
    }
}