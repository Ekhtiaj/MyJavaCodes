package array_demo;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] A=new int[3][3];
        int SumOfDiagonal=0;
        int SumOfUpperElements=0;
        int SumOfLowerElements=0;
        //Taking Matrix A(3X3) input from the user:
        System.out.println("Give your 3X3 Matrix: ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf(""+"A[%d][%d]=",i,j);
                A[i][j]=input.nextInt();
            }
        }
        //Showing Matrix A:
        System.out.println("\nA= ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(A[i][j]+"\t");
            }
            System.out.println("");
        }
        //Showing the sum of the diagonal,upper,lower elements:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //System.out.print(A[i][j]+"\t");
                if (i==j){
                    SumOfDiagonal=SumOfDiagonal+A[i][j];
                }
                if (i<j){
                    SumOfUpperElements=SumOfUpperElements+A[i][j];
                }
                if (i>j){
                    SumOfLowerElements=SumOfLowerElements+A[i][j];
                }
            }

        }
        System.out.println("Sum of Diagonal Elements= "+SumOfDiagonal);
        System.out.println("Sum of Upper Diagonal Elements= "+SumOfUpperElements);
        System.out.println("Sum of Lower Diagonal Elements= "+SumOfLowerElements);
    }
}
