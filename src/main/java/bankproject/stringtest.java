package bankproject;

import java.util.Scanner;

public class stringtest {
    public static void main(String[] args) {
        String fname="Md";
        String mname="simon";
        String up=mname.toUpperCase();
        System.out.println(up);

        String lo= mname.toLowerCase();
        System.out.println(lo);

        String lname="chy";
        String fullname= fname+" "+mname+" "+lname;
        System.out.println(fullname);

        if(fname.equals(lname)){
            System.out.println("name is equel");
        }
        else {
            System.out.println("name is not equel");


        }

        int pass=1234;
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your password");

        int password = obj.nextInt();

        System.out.println(password);

    }

}