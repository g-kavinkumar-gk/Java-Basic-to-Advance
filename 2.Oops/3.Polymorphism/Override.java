/*
 * Write a program to illustrate Method Overriding.

Create a class named Player with following protected attributes.

Data Type       Variable Name

String              name

String              teamName

Long                noOfMatches

Create appropriate constructor for the above attributes. The order in which the arguments are passed is name,teamName, noOfMatches. Include the following methods in the Player class.

Method Name                     Method Description

void displayDetails()           In this method, display the player details by reading valuesof above attributes from the user.

 

Create a class named Bowler that extends Player class with the following private attributes.

Data Type       Variable Name

Long            noOfWickets

 

Create appropriate constructor for the above attributes.The order in which the arguments are passed is name,teamName,noOfMatches, noOfWickets. Override the method displayDetails() defined in the Player class. This method displays Bowler details along with the player details.

Create a class named Batsman that extends Player class with the following private attributes..

Data Type           Variable Name

Long                    noOfRuns

Create appropriate constructor for the above attributes.The order in which the arguments are passed is name,teamName,noOfMatches,noOfRuns. Override the method displayDetails() defined in the Player class. This method displays Batsman details along with the player details. Create a Main class and in the main method test the above class.

Input and Output Format:

Refer sample input and output for formatting specifications.

All text in bold corresponds to input and the rest corresponds to output.
 
 */

 import java.util.*;
 public class Override {
   public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
     
     int now,nom,run;
     String name,tname;
     //input
     name=reader.nextLine();
     tname=reader.nextLine();
     nom=reader.nextInt();
     
     int opt=reader.nextInt();
     switch(opt){
       case 1:
         now=reader.nextInt();
         Bowler obj=new Bowler(name,tname,nom,now);
         obj.show();
         break;
       case 2:
         run=reader.nextInt();
         Batsman bat=new Batsman(name,tname,nom,run);
         bat.show();
         break;
       default:
         System.out.println("invalid Input");
     }
   }
 }
 
 class Player{
   protected String name,tname;
   int nom;
   Player(String name,String tname,int nom){
     this.name=name;
     this.tname=tname;
     this.nom=nom;
   }
   
   protected void show(String str){
     System.out.println(str+": "+name);
     System.out.println("Team: "+tname);
     System.out.println("Number of matches: "+nom);
   }
 }
 class Bowler extends Player{
   int now;
   Bowler(String name,String tname,int nom,int now){
     super(name,tname,nom);
     this.now=now;
   }
   protected void show(){
     super.show("Bowler");
     System.out.println("Number of wickets taken: "+now);
   }
 }
 
 class Batsman extends Player{
   int run;
   Batsman(String name,String tname,int nom,int run){
     super(name,tname,nom);
     this.run=run;
   }
   protected void show(){
     super.show("Batsman");
     System.out.println("Number of runs scored: "+run);
   }
 }