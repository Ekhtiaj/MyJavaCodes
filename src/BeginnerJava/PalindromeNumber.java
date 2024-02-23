package BeginnerJava;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("In this programme, I'll tell you each each palindrome number between your given limit and also I'll count and print number of palindrome numbers: ");
        System.out.println("What's your smaller number? ");
        int m=input.nextInt();
        System.out.println("What's your bigger number? ");
        int n=input.nextInt();
        int times=0;
        for (m=m;m<=n;m++){
            int temp=m;
            int sum=0;
            while(temp!=0){
                int r=temp%10;
                sum=sum*10+r;
                temp=temp/10;

            }
            if(sum==m){
                System.out.print(m+" ");
                times=1+times;
            }
            else{
                System.out.print(" ");
            }

        }System.out.println("Total numbers of Palindrome numbers are: "+times);

    }
}
