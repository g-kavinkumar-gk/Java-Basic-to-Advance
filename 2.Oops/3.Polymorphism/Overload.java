/*
 * Write a program to illustrate Method Overloading.

Create a class named Match.

There are no attributes in this class.

Include the following methods in the Match class.

• void displayMatch Details(DateTime match Date) --- In this method, 
display the date on which the match will be held in MM-dd-yyy format, 
Input date format is dd/MM/yyyy 

• void displayMatchDetails(String venue) --- In this method, venue has "stadium name,city". 
display the stadium name and city seperately by using split() method.

• void displayMatch Details(String winnerTeam,long runs) --- 
In this method, display the outcome of the match - winner Team and Won by how many runs.

Create a Main class and in the main method test the Match class.

Input and Output Format:

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.
 */

 import java.util.*;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 public class Overload {
   public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     String stad,date,outcome;
     int run;
     Match obj=new Match();
     
     int opt=reader.nextInt();
     reader.nextLine();
     switch(opt){
       case 1:
         date=reader.nextLine();
         obj.matchDet(date);
         break;
       case 2:
         stad=reader.nextLine();
         obj.matchDet(stad.split(","));
         break;
       case 3:
         outcome=reader.nextLine();
         run=reader.nextInt();
         obj.matchDet(outcome,run);
         break;
       default:
         System.out.println("Invalid Input");
     }
   }
 }
 
 class Match{
   
   public void matchDet(String ip_date){
     try {
       SimpleDateFormat ipformat=new SimpleDateFormat("dd/MM/yyyy");
       SimpleDateFormat opformat=new SimpleDateFormat("MM-dd-yyyy");
       Date date=ipformat.parse(ip_date);
       
       System.out.println("Match Date: "+opformat.format(date));
         
     }catch(ParseException e){
       System.out.println("error :"+e.getMessage());
     }
   }
   
   public void matchDet(String arr[]){
     // String arr[]=new String[10];
     // arr=data.split(",");
     System.out.println("Stadium: "+arr[0]+"\nCity: "+arr[1]);
   }
   
   public void matchDet(String team,int run){
     System.out.println(team+" won by "+run+" runs.");
   }
 }