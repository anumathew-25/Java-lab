/**********************************************************************
*File        - MatrixMultiply.java
*Author      - Anu Mathew
*Description - Java program to execute matrix multiplication
*Date        - 2/12/2021
*Version     - 1.0 
********************************************************************/

import java.util.Scanner;

public class MatrixMultiply{
public static void main(String[] args){

    int row1, row2,col1,col2,i,j,k,sum;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows of first matrix: ");
    row1 = input.nextInt();

    System.out.print("Enter the number of columns of first matrix: ");
    col1 = input.nextInt();
    System.out.print("Enter the number of rows of second matrix:");
    row2 = input.nextInt();

    System.out.print("Enter the number of columns of second matrix:");
    col2 = input.nextInt();
    
    if(col1==row2){

        int matrix1[][] = new int[row1][col1];
        int matrix2[][] = new int[row2][col2];
        int product[][] = new int[row1][col2];

        System.out.println("Enter the elements of first matrix: ");

        for ( i= 0 ; i < row1 ; i++ ){
            for ( j= 0 ; j < col1 ;j++ )
            matrix1[i][j] = input.nextInt();
        }
        System.out.println("Enter the elements of second matrix: ");

        for ( i= 0 ; i < row2 ; i++ ){
            for ( j= 0 ; j < col2 ;j++ )
                matrix2[i][j] = input.nextInt();
        }
        input.close();
        System.out.println("The product matrix is ");
        for ( i= 0 ; i < row1 ; i++ )
        for ( j= 0 ; j <col2;j++)
        {
        sum=0;
        for ( k= 0 ; k <row2;k++ ){
            sum +=matrix1[i][k]*matrix2[k][j] ;
        }

        product[i][j]=sum;
        }
        for ( i= 0 ; i < row1; i++ ){
            for ( j=0 ; j < col2;j++ )
            System.out.print(product[i][j]+" ");

            System.out.println();
        }
        }
        
    else
    System.out.print("Matrix multiplication is impossible!! ");
    }
    

}
