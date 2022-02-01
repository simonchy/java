package bankproject;
import java.util.Scanner;


public class bank {
    public static void main(String[] args) {

        int pw = 4321;
        int totalbalance, deposit, withdow;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your password");

        int password = obj.nextInt();

        System.out.println(password);

        if (password == pw) {

            System.out.println("you entered right password");


            System.out.println("enter your total balance");

            totalbalance = obj.nextInt();

            System.out.println("your total balance= 1" + totalbalance);

            System.out.println("Enter your deposit balance");
            deposit = obj.nextInt();
            System.out.println("you deposit = " + deposit);
            totalbalance = totalbalance + deposit;

            System.out.println("after diposit you balance= " + totalbalance);
            System.out.println("enter your widrow balance");
            withdow = obj.nextInt();
            System.out.println("you wihdow = " + withdow);
            totalbalance = totalbalance - withdow;

            System.out.println("after withdow your balance = " + totalbalance);
        }
        else
        {
            System.out.println("you did not enter right password");

        }

    }
}