
/*
    Author  -   Harsh Ponia
    Date    -   29/08/2021
    Problem/task    -  
    
                *
              * * 
            * * *
          * * * *
        * * * * *


      1. for (i = 1; i< =n;i++)
      2. for (j = 1;j<=i;j++)
      3. for (j =i;j<=n;j++) 


 */


package Basics;

import java.util.Scanner;

public class pattern2 {
 
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scan.nextInt();
        scan.close();
        for (int i=0;i<=n;i++)
        {

          for (int j =i;j<=n;j++) 
          {
            System.out.print(" ");
          }
          for (int j = 0;j<=i;j++)
          {
            System.out.print("*");
          }
          
          System.out.println();
        }
    }   
}
