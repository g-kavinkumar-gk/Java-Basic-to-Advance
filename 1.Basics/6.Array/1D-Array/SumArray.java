import java.util.*;
public class SumArray {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int arr[]=new int[20];
    int n,var,sum=0;
    var=reader.nextInt();
    for(int i=0;i<var;i++){
      n=reader.nextInt();
      arr[i]=n;
      sum+=n;
    }
    System.out.println(sum);
  }
}