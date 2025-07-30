/*imple Interface

An Interface consists of a contract of set of methods with only declaration and no implementation. Any class which implements the interface commits that all methods would be implemented. Here is a program to illustrate a simple interface.

1. Create an Interface Player Statistics

Add a method with the following prototype

public void display Player Statistics

2. Create class Player which implements the I Player Statistics Interface

Include private data members:

String name

String team Name

Integer no of Matches

Long total Runs Scored

Integer no of Wickets Taken

Include an 5 argument constructor with following arguments: name, team Name, no of Matches, total Runs Scored, no Of Wickets Taken and implement the Interface method public void display Player Statistics to display the player details.

Create a Main class with main method to test test above classes. */

import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String name,team;
    int mat,run,wic;
    Player obj=new Player();
    
    System.out.println("Enter player name: ");
    name=reader.nextLine();
    System.out.println("Enter team name: ");
    team=reader.nextLine();
    System.out.println("Enter number of matches played: ");
    mat=reader.nextInt();
    System.out.println("Enter total run scored: ");
    run=reader.nextInt();
    System.out.println("Enter number of wickets taken: ");
    wic=reader.nextInt();
    obj.setData(name,team,mat,run,wic);
    obj.show();
  }
}

interface PlayerStat{
  public void show();
}

class Player implements PlayerStat{
  private String name,tname;
  private int nom,run,now;
  
  public void setData(String name,String team,int mat,int run,int wic){
    this.name=name;
    this.tname=team;
    this.nom=mat;
    this.run=run;
    this.now=wic;
  }
  
  public void show(){
    System.out.println("Player Details: ");
    System.out.println("Player name: "+name);
    System.out.println("Team name: "+tname);
    System.out.println("No of matches: "+nom);
    System.out.println("Total runs scored: "+run);
    System.out.println("No of wickets taken: "+now);
  }
}