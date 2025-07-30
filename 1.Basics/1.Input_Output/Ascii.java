import java.util.*;


public class Ascii{
    public static void main(String a[]){
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter value for ascii character: (*Note: ascii limit is 128 )");
        int ascii=reader.nextInt();
        char var1=(char)ascii;
        System.out.println(ascii+" the character of given value is : "+var1);
    }
}