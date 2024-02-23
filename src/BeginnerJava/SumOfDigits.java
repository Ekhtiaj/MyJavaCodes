package BeginnerJava;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Give a number, I'll show the reverse number: ");
        n=input.nextInt();
        int r;
        System.out.print("The reverse number is: ");
        while(n!=0){
            r=n%10;
            System.out.print(r);
            n=n/10;

        }

    }
}
