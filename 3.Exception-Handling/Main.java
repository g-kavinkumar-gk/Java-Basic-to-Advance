import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int a,b,c;
    a=reader.nextInt();
    b=reader.nextInt();
    
    try{
      c=a/b;
      System.out.println(c);
    }catch(ArithmeticException e){
      System.out.println("Cannot divide by zero");
      // System.out.println(e.getMessage());// \by zero
    }
  }
}