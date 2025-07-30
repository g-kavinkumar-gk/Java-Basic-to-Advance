/*
Write a program to count the number of vowels in the given string
*/

import java.util.*;
public class VowelCount {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String str;
    str=reader.nextLine();
    int vow=0;
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' ){
        vow++;
      }
    }
    System.out.print("Number of vowel: "+vow);
  }
}