package array_demo;

import java.util.Scanner;

public class Assignment18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        int date;
        System.out.println("Enter date from (1-7): ");
        date=input.nextInt();
        if (date==1){
            System.out.println(weekdays[1]);
        }
        else if(date==2){
            System.out.println(weekdays[2]);
        }
        else if (date==3){
            System.out.println(weekdays[3]);
        }
        else if (date==4){
            System.out.println(weekdays[4]);
        }
        else if (date==5){
            System.out.println(weekdays[5]);
        }
        else if (date==6){
            System.out.println(weekdays[6]);
        }
        else if (date==7){
            System.out.println(weekdays[0]);
        }
         else{
            System.out.println("You enter Invalid");
        }



    }
}
