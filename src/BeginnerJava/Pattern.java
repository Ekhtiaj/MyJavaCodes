package BeginnerJava;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many lines of pattern do you want? ");
        int line=input.nextInt();
        for (int i=1;i<=line;i++){
            for (int j=1;j<=i;j++){
                if(j%2!=0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
