/*A magic square is an arrangement of numbers (usually integers) in a square grid,
where the numbers in each row, and in each column, and the numbers in the 
forward and backward main diagonals, all add up to the same number.
Write a program to find whether a given matrix is a magic square or not.*/

import java.util.*;
public class MagicSq {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int arr[][]=new int[10][10];
    int arn[][]=new int[10][10];
    int r,c,n=0,sum1=0,sum2=0;
    r=reader.nextInt();
    c=r;
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        arr[i][j]=reader.nextInt();
      }
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        n=arr[i][j];
        if(i==j){
          sum1+=n;
        }
      }
      for(int k=(c-1);k>=0;k--){
        arn[i][k]=n;
        if(i==k){
          sum2+=arn[i][k];
        }
      }
    }
    if(sum1==sum2){
      // System.out.println(sum1);
      // System.out.println(sum2);
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
}
