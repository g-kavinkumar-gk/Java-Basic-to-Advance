import java.util.*;
public class ArrCompare {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    // int arr2[]=new int[20];
    // int arr1[]=new int[20];
    
    int var1,var2,s1=0,s2=0;
    String op="Same";
    var1=reader.nextInt();
    for(int i=0;i<var1;i++){
      s1+=reader.nextInt();
    }
    var2=reader.nextInt();
    for(int i=0;i<var2;i++){
      s2+=reader.nextInt();
    }
    if(s1!=s2){ //confusion on working
      op="Not Same";
    }
    System.out.println(op);
    // System.out.println(s1);
    // System.out.println(s2);
  }
}