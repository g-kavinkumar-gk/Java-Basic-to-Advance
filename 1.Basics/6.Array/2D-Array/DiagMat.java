/*
Diagonal Matrix. 
A square matrix which has zeros everywhere other than the main diagonal. 
Entries on the main diagonal may be any number, including 0.

Write a program to find whether a given matrix is a diagonal matrix or not.
*/

import java.util.*;
public class DiagMat {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int r,c,n=0,dg=0,val=0;
    int arr[][]=new int[10][10];
    r=reader.nextInt();
    c=r;
    for(int i=0;i<r;i++){
      val=0;dg=0;
      for(int j=0;j<c;j++){
        arr[i][j]=reader.nextInt();
        val+=arr[i][j];
        if(i==j){
          dg=arr[i][j];
        }
      }
      if(dg==val){
        n++;
      }
    }
    if(n==r){
      System.out.println("yes");
    }
    else{
      System.out.println("no");
    }
  }
}