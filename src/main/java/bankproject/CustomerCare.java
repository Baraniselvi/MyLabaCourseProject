package bankproject;

import java.util.Scanner;

public class CustomerCare {

    public int customercarenumber = 1800232345;


    public CustomerCare(int customercarenumber){
       this.customercarenumber = customercarenumber;

    }
    public void call() {



            System.out.println("If you face any problem ,Call " + customercarenumber);



    }
    public void options()
    {
        System.out.println("Enter the options for inquiries");
        while(true) {
            System.out.println("Press 1 for New Account creation and transaction inquiries");
            System.out.println("Press 2 for loan and other inquiries");
            System.out.println("Press 3 for exit from the call");
            Scanner sa = new Scanner(System.in);
            int opt = sa.nextInt();
            if(opt ==1)
            {
                System.out.println("you have reached the New Account creation and transaction inquiries");
                break;

            }

            else if(opt ==2)
            {
                System.out.println("you have entered the loan and other inquiries");
                break;

            }
            else if(opt==3)
            {
                System.out.println("Exit the call");
                break;
            }
            else
            {
                break;
            }



        }

    }

















}
