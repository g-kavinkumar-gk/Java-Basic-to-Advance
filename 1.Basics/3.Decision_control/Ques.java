/*Electricity board have decided to charge rupees based on the units consumed by particular home.
If the units consumed is less than or equal to 200 the cost for one unit is 0.5.
 If the unit is less than or equal to 400 the cost for one unit is 0.65 and Rs.100 extra charge. 
 If the unit is less than or equal to 600 the cost for one unit is 0.80 and Rs.200 extra charge. 
 If the unit is greater than 600 the cost for one unit is 1.25 and Rs.425 extra charge.*/
 import java.util.*;
 public class Ques {
   public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     double cost,unit;
     unit=reader.nextInt();
     if(unit<=200){
       cost =(unit*0.5);
     }
     else if(200<unit && unit<=400){
       cost=(unit*0.65)+100;
     }
     else if(400<unit && unit<=600){
       cost=(unit*0.80)+200;
     }
     else{
       cost=(unit*1.25)+425;
     }
     
     int cos =(int) Math.ceil(cost);
     System.out.println("Rs."+cos);
   }
 }