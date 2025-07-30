
import java.util.*;
public class HourCal {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int hh,mm,ss,m,h;
    hh=reader.nextInt();
    mm=reader.nextInt();
    ss=reader.nextInt();
    if (ss>=60){
      m=(ss/60);
      ss=ss%60;
      mm=mm+m;
    }
    if(mm>=60){
      h=(mm/60);
      mm=mm%60;
      hh+=h;
    }
    System.out.println("Total Number of hours is "+hh);
    System.out.println("Total Number of minutes is "+mm);
    System.out.println("Total Number of seconds is "+ss);
  }
}