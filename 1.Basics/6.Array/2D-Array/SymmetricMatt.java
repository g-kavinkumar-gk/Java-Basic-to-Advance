/*A symmetric matrix is a square matrix that is equal to its transpose. 
Write a program to find whether a given matrix is a square matrix or not.
 */

import java.util.*;
public class SymmetricMatt {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int arr[][]=new int[10][10];
    int arn[][]=new int[10][10];
    int r,c;
    boolean sym=true;
    r=reader.nextInt();
    c=reader.nextInt();
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arn[j][i]=arr[i][j]=reader.nextInt();
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<r;j++){
        if(arr[i][j]!=arn[i][j]){
          sym=false;
        }
      }
    }
    if(sym){
      System.out.println("symmetric");
    }
    else{
      System.out.println("Not Symmetric");
    }
  }
}
