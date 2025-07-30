
import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    char var=reader.next().charAt(0);
    if (Character.isLetter(var)){
      char ch=Character.toLowerCase(var);
      if(var == ch){
        System.out.println("Lower");
      }
      else{
        System.out.println("Upper");
      }
    }
    else if (Character.isDigit(var)){
      System.out.println("Number");
    }
    else{
      System.out.println("Symbol");
    }
  }
}