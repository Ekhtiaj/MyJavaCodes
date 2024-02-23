package BeginnerJava;
import java.util.Scanner;
public class Asssignment16Loop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String Username;
        String Password;
        System.out.print("Username: ");
        Username=input.nextLine();
        System.out.print("Password: ");
        Password=input.nextLine();
        if(Username.equals("anis")&&Password.equals("123456")){
            System.out.println("Welcome to the system");
        }
        else{
            System.out.println("username/password is incorrect");
        }
    }
}
