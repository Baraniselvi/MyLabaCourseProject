package bankproject;

import java.util.Date;
import java.util.Scanner;

public class BankProcess {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("USA", "7th Street,Texas" );
        CustomerCare obj1 = new CustomerCare(1800232345);
        obj.createaccount();
        obj.login();





        System.out.println(" Location Name :" + obj.location);


        System.out.println("Location Address " + obj.locationaddress);


        obj.deposit();
        obj.setDate();
        obj.withdrawal();
        System.out.println();
        obj1.call();
        obj1.options();



    }
}
