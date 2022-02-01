package homework;

import java.util.Scanner;

public class cf {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("welcome sir");
        System.out.println("what kind of Coffee do u want?");
        int size= obj.nextInt();

        if(size==1){

            System.out.println("You select Small Coffee");
            System.out.println("How many coffee do you want sir?");
            int count= obj.nextInt();
            int price=4;
            int totalbalance= count*price;
            System.out.println("Your totalbalance= " +totalbalance);

        }else if (size==2){

            System.out.println("You select Medium Coffee");
            System.out.println("How many coffee do you want sir?");
            int count= obj.nextInt();
            int price=6;
            int totalbalance= count*price;
            System.out.println("Your totalbalance= " +totalbalance);



        }else if(size==3){

            System.out.println("You select Large Coffee");
            System.out.println("How many coffee do you want sir?");
            int count= obj.nextInt();
            int price=12;
            int totalbalance= count*price;
            System.out.println("Your totalbalance= " +totalbalance);



    }else{
            System.out.println("Invalid selection");

        }

        System.out.println("Thank You Sir !! Have a wonderful day");
}
}
