package array_demo;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("How many numbers do you want to add and see the average?");
        n=input.nextInt();
        double[] number=new double[n];
        double sum=0;
        System.out.println("Give me your array's numbers:");
        for (int i=0;i<n;i++){
            number[i]=input.nextDouble();
            sum=sum+number[i];
        }
        System.out.println("The sum of your array is= "+sum);
        double average;
        average=sum/n;
        System.out.println("The average of your array is= "+average);

    }
}
