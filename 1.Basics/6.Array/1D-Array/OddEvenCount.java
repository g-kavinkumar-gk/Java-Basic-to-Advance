import java.util.*;
public class OddEvenCount {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int[] arr=new int[10];
    int n,var,odd=0,even=0;
    var=reader.nextInt();
    for(int i=0;i<var;i++){
      n=reader.nextInt();
      arr[i]=n;
    }
    for(int i=0;i<var;i++){
      n=arr[i];
      if(n%2==0){
        even++;
      }
      else{
        odd++;
      }
    }
    System.out.println("Odd: "+odd);
    System.out.println("Even: "+even);
  }
}