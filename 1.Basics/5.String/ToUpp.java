/* 
Write a program to change the given string to uppercase without using string library function
*/

import java.util.*;
public class ToUpp {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str,r="";
    str=reader.nextLine();
    // str=str.toUpperCase();
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      System.out.println(c);
      if(c>='a' && c<='z'){r+=(char)(c-32);}
      else{r+=c;}
    }
    System.out.println("String in uppercase is "+r);
  }
}
