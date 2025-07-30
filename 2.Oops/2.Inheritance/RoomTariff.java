/*
The task is to get the details of the hotel room and display the final cost of the room using a menu driven application.

Write a Java program to Implement this task.

Include the following data members / attributes:

Create a class Hotel Room

hotelName of type String

numberOfSqFeet - of type Integer

hasTV - of type Boolean

hasWifi - of type Boolean

Include the following public methods:

Create a constructor that initializes all the data members

public Hotel Room (String hotel Name, Integer numberOfSq Feet, Boolean has TV, Boolean hasWifi) "calculate Tariff" - Calculates cost using the number of sq feets and cost per sq feet and returns an Integer. "getRatePerSq Feet" - This method returns an Integer. In this case, it always returns 0

Create a class DeluxeRoom that extends HotelRoom

Include the following attributes / data members:

ratePerSqFeet - of type Integer.

Include the following public methods:

Include a constructor that sets ratePerSq Feet as 10.

public HotelRoom (String hotelName, Integer numberOfSq Feet, Boolean has TV, Boolean hasWifi) "getRatePerSqFeet" - returns (ratePerSq Feet + 2) if wifi is present, else returns ratePerSqFeet.

Create a class DeluxeACRoom that extends DeluxeRoom

Include the following public methods:

Include a constructor that sets ratePerSqFeet as 12.

Create a class SuiteACRoom that extends Hotel Room

Include the following attributes / data members: ratePerSqFeet - of type Integer.

Include the following public methods:

Include a constructor that sets ratePerSq Feet as 15.

public HotelRoom (String hotelName, Integer numberOfSq Feet, Boolean hasTV, Boolean hasWifi) getRatePerSq Feet - returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.

Create a Main class to test the above classes.

Include the following public methods:

Include a constructor that sets ratePerSq Feet as 10.

public HotelRoom (String hotelName, Integer numberOfSq Feet, Boolean hasTV, Boolean hasWifi) "getRatePerSqFeet" – returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.

Create a class DeluxeACRoom that extends Deluxe Room

Include the following public methods:

Include a constructor that sets ratePerSqFeet as 12.

Create a class SuiteACRoom that extends Hotel Room Include the following.private attributes / data members: ratePerSqFeet - of type Integer.

Include the following public methods:

Include a constructor that sets ratePerSqFeet as 15.

public HotelRoom (String hotelName, Integer numberOfSq Feet, Boolean hasTV, Boolean hasWifi) getRatePerSq Feet - returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.

Create a Main class to test the above classes.


Constraints:
Constraints:
Menu Choice: Should be 1, 2, or 3 only.
Hotel Name: Should be a non-empty string.
Room Square Feet Area: Should be a positive integer greater than 0.
Room has TV & Wifi: Input should be "yes" or "no" (case-insensitive), and converted to Boolean (true/false).
Rate per Square Feet:
Deluxe Room: ₹10 (₹12 if WiFi is present).
Deluxe AC Room: ₹12 (₹14 if WiFi is present).
Suite AC Room: ₹15 (₹17 if WiFi is present).
Tariff Calculation: Tariff=Number of Sq. Feet×Rate per Sq. Feet\text{Tariff} = \text{Number of Sq. Feet} \times \text{Rate per Sq. Feet}Tariff=Number of Sq. Feet×Rate per Sq. Feet
Final Tariff: Should be displayed as an integer (no decimal places).
 */

import java.util.*;
public class RoomTariff {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    
    String name,stv,swifi;
    int area;
    boolean tv=false,wifi=false;
    
    int opt=reader.nextInt();
    reader.nextLine();
    System.out.println("Hotel Name:");
    name=reader.nextLine();
    System.out.println("Room Square Feet Area:");
    area=reader.nextInt();
    reader.nextLine();
    System.out.println("Room has TV (yes/no):");
    stv=reader.nextLine();stv.trim();
    System.out.println("Room has Wifi (yes/no):");
    swifi=reader.nextLine();swifi.trim();
    if(stv.equals("yes")){tv=true;}
    if(swifi.equals("yes")){wifi=true;}
    
    // Hotel obj=new Hotel(name,area,tv,wifi);//won't work like this
    //choosing class with case 
    switch(opt){
      case 1:
        Deluxe room1=new Deluxe(name,area,tv,wifi);
        room1.calTariff(room1.rate(wifi));
        break;
      case 2:
        DeluxeAC room2=new DeluxeAC(name,area,tv,wifi);
        room2.calTariff(room2.rate(wifi));
        break;
      case 3:
        Suite room=new Suite(name,area,tv,wifi);
        room.calTariff(room.rate(wifi));
        break;
      default:
        System.out.println("Invalid Input");
    }
  }
}

class Hotel{
  public String name;
  public int sqFeet;
  public boolean hasTv,hasWifi;
  
  Hotel(String name,int feet,boolean tv,boolean wifi){
    this.name=name;
    this.sqFeet=feet;
    this.hasTv=tv;
    this.hasWifi=wifi;
  }
  public void calTariff(int rate){
    System.out.println("Room Tariff per day is: "+(rate*sqFeet));
  }
}

class Deluxe extends Hotel{
  public int sqRate=10;
  Deluxe(String name, int area,boolean tv,boolean wifi){
    super (name,area,tv,wifi);
  }
  public int rate(boolean wifi){
    if(wifi){return sqRate+2;}
    else{return sqRate;}
  }
}

class DeluxeAC extends Hotel{
  public int sqRate=12;
  DeluxeAC(String room , int area , boolean tv ,boolean wifi){
    super(room,area,tv,wifi);
  }
  public int rate(boolean wifi){
    if(wifi){return sqRate+2;}
    else{return sqRate;}
  }
}

class Suite extends Hotel{
  public int sqRate=15;
  Suite(String name,int area,boolean tv,boolean wifi ){
    super(name,area,tv,wifi);
  }
  public int rate(boolean wifi){
    if(wifi){return sqRate+2;}
    else{return sqRate;}
  }
}