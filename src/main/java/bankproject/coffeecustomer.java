package bankproject;

import java.util.Scanner;

public class coffeecustomer {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.println("What kind of coffee you want?.For small press 1.For midum press 2,For large press 3");



        int size= obj.nextInt();

        if (size==1){
            System.out.println("you select small coffee ");
            System.out.println("How many coffee do u want?");
            int count= obj.nextInt();
            int price=4;
            int totalbal= count*price;
            System.out.println("your total bal="+totalbal);


        }else if (size==2){
            System.out.println("you select midum coffee ");
                System.out.println("How many coffee do u want?");
                int count= obj.nextInt();
                int price=7;
                int totalbal= count*price;
                System.out.println("your total bal="+totalbal);

        }else if(size==3){
            System.out.println("you select large coffee ");
            System.out.println("How many coffee do u want?");

            int count= obj.nextInt();
            int price=10;
            int totalbal= count*price;
            System.out.println("your total bal="+totalbal);


        }




        else {
            System.out.println("You entered  invalid number,number should be pressed 1,2,3");
        }

        System.out.println("Thank you for coming");



    }
}
