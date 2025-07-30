/* 
Write a program to find the reverse of the given string without using string library functions.
*/

import java.util.*;
public class Rev {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str,rstr="";
    str=reader.nextLine();
    // rstr=new StringBuilder(str).reverse().toString();
    for(int i=(str.length()-1);i>=0;i--){
      rstr+=str.charAt(i);
    }
    System.out.println("The reversed String is "+rstr+".");
  }
}
