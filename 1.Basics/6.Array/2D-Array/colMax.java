// Write a  program to find the maximum element in each column of the matrix.

import java.util.*;
public class colMax {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int arr[][]=new int[10][10];
    int row,col,max,n;
    row=reader.nextInt();
    col=reader.nextInt();
    for(int i=0;i<row;i++){
      for(int j=0;j<col;j++){
        arr[i][j]=reader.nextInt();
      }
    }
    for(int i=0;i<col;i++){
      max=0;
      for(int j=0;j<row;j++){
        n=arr[j][i];
        if(n>max){
          max=n;
        }
      }
      System.out.println(max);
    }
  }
}