/*Zack is going to celebrate his birthday on January. 
His father wants to buy a new dress for his son. 
As they are Christian, he also wants to buy new dress for Christmas. 
As all the textile showrooms offers discount on the month of December his father decides to buy dress for 
Zack's birthday in December itself. Before that he wants to know how much discounts they give on each month. 
In the first month of the year they offer 20% discount. In the third and fourth month they offer 10% discount. 
In the sixth and seventh month they offer 75% discount. In the tenth and eleventh month they offer 30% discount.
 In the twelfth moth they offer 35% discount. Implement this program using switch*/

 import java.util.*;
 public class Disco {
   public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     double amt,mon,price;
     amt=reader.nextDouble();
     mon=reader.nextDouble();
     switch((int)mon){
       case 1:price=(amt-(amt*0.2));;break;
       case 3,4 :price=(amt-(amt*0.1));break;
       case 6,7: price=(amt-(amt*0.75));break;
       case 10,11: price=(amt-(amt*0.3));break;
       case 12:price=(amt-(amt*0.35));break;
       default:price=amt;
     }
     System.out.printf("Zack's father needs to pay Rs.%.2f.\n",price);
   }
 }