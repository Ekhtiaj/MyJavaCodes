package array_demo;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      int [] num={1,2,3,4,5,6};
      int sum=0;
      for (int x:num){
          sum=sum+x;
        }
        System.out.println("The sum of the numbers are= "+sum);
    }
}


