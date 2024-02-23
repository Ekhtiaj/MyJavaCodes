package array_demo;

import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("What is the size of your 1Dimensional Array? ");
        n=input.nextInt();
        double[] array=new double[n];
        System.out.println("Give your 1D array values: ");
        for (int i=0;i<n;i++){
            array[i]=input.nextDouble();
        }
        double max=array[0],min=array[0];
        for (int i=0;i<n;i++){
            if (max>array[i]){
                max=max;
            }
            else {
                max=array[i];
            }

        }
        for (int i=0;i<n;i++){
            if (min<array[i]){
                min=min;
            }
            else {
                min=array[i];
            }

        }
        System.out.println("Maximum number is= "+max);
        System.out.println("Minimum number is= "+min);
    }
}
