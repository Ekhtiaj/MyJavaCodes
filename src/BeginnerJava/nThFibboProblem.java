package BeginnerJava;
import java.util.Scanner;
public class nThFibboProblem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("In this program, I'll write the n th Fibonacci number in the Fibonacci series.");
        System.out.println("So, which number Fibonacci number do you want? ");
        int n;
        n=input.nextInt();
        int first=0,second=1;
        int fibo=0;
        for (int i=3;i<=n;i++){
            fibo=first+second;
            first=second;
            second=fibo;
        } System.out.print(fibo);
    }
    }
