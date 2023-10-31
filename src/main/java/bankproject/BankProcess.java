package bankproject;

import java.util.Date;
import java.util.Scanner;

public class BankProcess {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("USA", "7th Street,Texas" );
        CustomerCare obj1 = new CustomerCare(1800232345);
        Audit obj2 = new Audit();
        GlobalBanking obj3 = new GlobalBanking();
        HumanResource obj4 = new HumanResource();
        LoanSection obj5 = new LoanSection();
        NetBanking obj6 = new NetBanking();
        Operations obj7 = new Operations();
        Sales obj8 = new Sales();
        StockAndInvestment obj9 = new StockAndInvestment();

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
        System.out.println();
        obj2.internalaudit();
        obj2.externalaudit();
        System.out.println();
        obj3.internationalcustomer();
        obj3.transactions();
        System.out.println();
        obj4.employeedetails();
        obj4.training();
        obj4.recruitmentboarding();
        System.out.println();
        obj5.housingloan();
        obj5.mortgageloan();
        obj5.housingloan();
        System.out.println();
        obj6.neft();
        obj6.customertransactionhistory();
        System.out.println();
        obj7.operation();
        System.out.println();
        obj8.creditcard();
        obj8.customerdetails();
        obj8.revenue();
        System.out.println();
        obj9.stockhistory();
        System.out.println("*****************************");




    }
}
