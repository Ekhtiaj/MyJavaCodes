import java.util.Scanner;
public class HelloWorld {
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Give a limit, I'll generate all the armstrong numbers and tell the number of Armstrong numbers: ");
    System.out.println("What's your lower number?");
    int m=input.nextInt();
    System.out.println("What's your upper number?");
    int n=input.nextInt();
    int times=0;
    System.out.println("The armstrong numbers are: ");
    for(m=m;m<=n;m++){
        int sum=0,temp=m;
        while(temp!=0){
            int r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(sum==m){
            System.out.println(m+" ");
            times=1+times;
        }
        else{
            System.out.print("");
        }
    }
    System.out.println("There are "+times+" Armstrong numbers");
}
}
