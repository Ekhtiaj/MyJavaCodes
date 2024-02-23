package array_demo;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] array=new int[4][5];
        System.out.println("Give your 4X5 matrix A:");
        //Taking an 4X5 matrix A:
        for(int row=0;row<=3;row++){
            for (int col=0;col<5;col++){
                System.out.print("A["+row+"]["+col+"]=");
                array[row][col]=input.nextInt();
                System.out.println();
            }
        }
        //printing matrix A:
        System.out.println("A= ");
        for(int row=0;row<4;row++){
            for (int col=0;col<5;col++){
                System.out.print(array[row][col]);
                System.out.print("\t");
            }
            System.out.println();
        }


    }
}
