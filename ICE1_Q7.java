public class ICE1_Q7{
    public static void main(String[] args){
        String[] days = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh","eighth", "ninth", "tenth", "eleventh", "twelfth" }; 

        System.out.print("On the " + days[0] + " day of Christmas, my true love sent to me");
        System.out.println(" A partridge in a pear tree.");

        for (int i = 1; i < days.length; i++){
            int index = i;
            switch (index){
                case 1:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Two turtle doves, and A partridge in a pear tree.");
                    break;
                case 2:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 3:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 4:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 5:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Six geese a-laying, Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 6:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Seven swans a-swimming, six geese a-laying, Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 7:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Eight maids a-milking, seven swans a-swimming, six geese a-laying, Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 8:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Nine ladies dancing, eight maids a-milking, seven swans a-swimming, six geese a-laying, Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 9:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Ten lords a-leaping, nine ladies dancing, eight maids a-milking, seven swans a-swi'mmi'ng, six geese a-laying, Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 10:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Eleven pipers piping, ten lords a-leaping, nine ladies dancing, eight maids a-milking, seven swans a-swimming, Six geese a-laying, Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
                case 11:
                    System.out.print("On the " + days[i] + " day of Christmas, my true love sent to me");
                    System.out.println(" Twelve drummers drumming, eleven pipers piping, ten lords a-leaping, nine ladies dancing, eight maids a-milking, seven swans a-swimming, six geese a-laying, Five golden rings. Four calling birds, three French hens, two turtle doves, and A partridge in a pear tree.");
                    break;
            }
        }
    }
}