package com.bridgelabz;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String args[])
    {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        //taking row as input
        m=sc.nextInt();
        System.out.println("Enter the number of Columns:");
        //taking column as input
        n=sc.nextInt();
        //Declaring the two-dimensional matrix
        int array[][] = new int [m][n];
        //Read the matrix values
        System.out.println("Enter the elements of the array :");
        //loop for row
        for(i=0;i<m;i++)
            //inner for loop for column
            for(j=0;j<n;j++)
                array[i][j]=sc.nextInt();
            //accessing array elements
            System.out.println("Elements of the array are:");
            for (i=0;i<m;i++)
            {
                for (j=0;j<n;j++)
                    //prints the array elements
                    System.out.println(array[i][j] + " ");
                System.out.println();
            }
    }
}
