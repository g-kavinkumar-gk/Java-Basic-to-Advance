/*
 * Write a program to check whether the given strings are anagrams or not.
 */

 import java.util.*;
 public class Anagram {
   public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     String s1,s2;
     s1=reader.nextLine();
     s2=reader.nextLine();
     char s1arr[]=s1.toCharArray();
     char s2arr[]=s2.toCharArray();
     Arrays.sort(s1arr);
     Arrays.sort(s2arr);
     s1=new String(s1arr);
     s2=new String(s2arr);
     if(s1.equals(s2)){
       System.out.println("Strings are anagrams");
     }
     else{
       System.out.println("Strings are not anagrams");
       
     }
   }
 }