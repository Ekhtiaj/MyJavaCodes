package BeginnerJava;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Give a number:");
        int num=input.nextInt();
        int sum=0,temp=num;
        while(temp!=0){
           int r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==num){
            System.out.println("This is a Armstrong number");
        }
        else{
            System.out.println("This is not a Armstrong number");
        }
    }
}
