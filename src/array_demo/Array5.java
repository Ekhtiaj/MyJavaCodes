package array_demo;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] A=new int[2][3];
        int[][] B=new int [2][3];
        System.out.println("Give your 1st 2X3 Matrix");
        //Getting input for Matrix A
        for (int i=0;i<2;i++){
            if (i==0){
                System.out.println("First row:");
            }
            else{
                System.out.println("Second row:");
            }
            for (int j=0;j<3;j++){

                A [i][j] =input.nextInt();
            }
        }
        //Getting input of Matrix B
        System.out.println("Give your 2nd 2X3 Matrix");
        for (int i=0;i<2;i++){
            if (i==0){
                System.out.println("First row:");
            }
            else{
                System.out.println("Second row:");
            }
            for (int j=0;j<3;j++){
                B [i][j] =input.nextInt();
            }
        }
        //Getting Matrix A output:
        System.out.println("Your matrix A is: ");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){

                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        //Getting Matrix B output:
        System.out.println("Your Matrix B is: ");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){

                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
       int[][] Sum=new int[2][3];
      //Getting Sum of Matrix A and Matrix B:
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                Sum [i][j] =A[i][j]+B[i][j];
            }
        }
        //Getting Sum output:
        System.out.println("The sum of 1st and second matrix is: ");
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(Sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
