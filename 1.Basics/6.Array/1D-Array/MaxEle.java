
import java.util.*;
public class MaxEle {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int arr[]=new int[10];
    int var,n,grt=0;
    var=reader.nextInt();;
    for(int i=0;i<var;i++){
      n=reader.nextInt();
      arr[i]=n;
      grt=n;
    }
    for(int i=0;i<var;i++){
      n=arr[i];
      if(n>grt){
        grt=n;
      }
    }
    System.out.println(grt);
  }
}