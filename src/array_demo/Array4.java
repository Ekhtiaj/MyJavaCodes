package array_demo;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] num=new int[2][3];
        num[0][0]=10;
        num[0][1]=20;
        num[0][2]=30;
        num[1][0]=40;
        num[1][1]=50;
        num[1][2]=60;
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(+num[i][j]+" ");
            }
            System.out.println();
        }



    }
}
