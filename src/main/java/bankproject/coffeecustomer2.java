package bankproject;

import java.util.Scanner;

public class coffeecustomer2 {
    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.println("What kind of coffee you want?.For small press S.For midum press M,For large press L");
      String size = obj.nextLine();




       // int size= obj.nextInt();

        if (size.equalsIgnoreCase("s")){
            System.out.println("you select small coffee ");
            System.out.println("Small coffee $4");
            System.out.println("How many coffee do u want?");
            int count= obj.nextInt();
            int price=4;
            int totalbal= count*price;
            System.out.println("your total bal="+totalbal);


        }else if ((size.equalsIgnoreCase("m"))){
            System.out.println("you select midum coffee ");
            System.out.println("Medium coffee $7");
                System.out.println("How many coffee do u want?");
                int count= obj.nextInt();
                int price=7;
                int totalbal= count*price;
                System.out.println("your total bal="+totalbal);

        }else if((size.equalsIgnoreCase("l"))){
            System.out.println("you select large coffee ");
            System.out.println("Small coffee $10");
            System.out.println("How many coffee do u want?");

            int count= obj.nextInt();
            int price=10;
            int totalbal= count*price;
            System.out.println("your total bal="+totalbal);


        }




        else {
            System.out.println("You entered  invalid number,number should be pressed S,M,L");
        }

        System.out.println("Thank you for coming");



    }
}
