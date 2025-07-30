/*
 * Write a program to count the frequency of alphabets in a given string.
 */
import java.util.*;
 public class CountAlpha {
   public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     int c=1;
     String str=reader.nextLine();
     char ch[]=str.toCharArray();
     Arrays.sort(ch);
     boolean b[]=new boolean[str.length()];//it was studied and implemented from web
     for(int i=0;i<str.length();i++){
       if(b[i]){continue;}
       c=1;
       for(int j=(i+1);j<str.length();j++){
         if(ch[i]==ch[j]){
           c++;
           b[j]=true;
         }
       }
       System.out.println(ch[i]+" "+c);
     }
   }
 }