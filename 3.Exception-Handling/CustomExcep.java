/* Create a program that validates a person's age using a custom exception.
If the age is less than 18, throw a custom exception named InvalidAgeException with the message 
"Age must be 18 or above".
Otherwise, print "Access granted". */

import java.util.*;
public class CustomExcep {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int age;
    age=reader.nextInt();
    try{
      if(age<18){
        // throw new Exception("Age must be 18 or above");
        throw new AgeException();
      }
      System.out.println("Access granted");
    }
    catch(AgeException e){
      System.out.println(e.getMessage());
    }
  }
}

class AgeException extends Exception{
  public AgeException(){// description is a constructor
    super("Age must be 18 or above");
  }
}