// operaters
// 

import java.util.*;
public class Operator {
    public static void main(String args[]){
        Scanner getInput= new Scanner(System.in);
        System.out.print("Enter the  variable: \nA: ");
        int a=getInput.nextInt();
        System.out.print("B: ");
        int b=getInput.nextInt();
        System.out.println("\nArthemeic Operators:");
        System.out.println("Added:"+(a+b)+"\nSubtracted:"+(a-b)+"\nMultiplied:"+(a*b)+"\nDivided:"+(a/b)+"\nRemainder:"+(a%b));
        System.out.println("Relational Operators:");
        // == , != , < , > , <= , >=

        System.out.println("A==B : "+ (a==b));
        System.out.println("A!=B : "+ (a!=b));
        System.out.println("A<=B : "+ (a<=b));
        System.out.println("A>=B : "+ (a>=b));
        System.out.println("A<B : "+ (a<b));
        System.out.println("A>B : "+ (a>b));

        
        System.out.println("Logical Operators:");
        System.out.println("AND- &&    OR- ||    NOT- !");


        System.out.println("Bitwise Operators:");
        System.out.println("&  |  <<  >>  ^  ~");
        System.out.println("A&B bitwise AND : "+ (a&b));
        System.out.println("A|B Bitwise OR : "+ (a|b));
        System.out.println("A^B Bitwise XOR : "+ (a^b));
        System.out.println("~B Bitwise not  : "+ (~b));
        System.out.println("A<<B left shift : "+ (a<<b));
        System.out.println("A>>B right shift : "+ (a>>b));

        
    }    
}
