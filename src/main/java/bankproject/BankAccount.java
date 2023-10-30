package bankproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class BankAccount {


    private int accountnumber;




    private int password;
    private String name;
    private String address;
    public Date date;

    private double currentbalance;

    public String location;
    public String locationaddress;



    public double getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(double depositamount) {
        this.depositamount = depositamount;
    }

    private double bal;
    private double amount= 50000;

    private double depositamount;


    private double withdraw;

    public BankAccount() {

    }

    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }


    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public double getCurrentbalance() {
        return currentbalance;
    }

    public void setCurrentbalance(double currentbalance) {
        this.currentbalance = currentbalance;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public BankAccount(String location,String locationaddress){
        this.location= location;
        this.locationaddress = locationaddress;


    }



    public void createaccount() {

        System.out.println("KYC(know your customer must be cleared for opening Account)");
        while (true) {
            System.out.println("Eligible for opening a account");

            break;
        }



    }

    public void login() {
        System.out.println();

        Scanner sl = new Scanner(System.in);
        System.out.println("Enter your Account number");
        int acc = sl.nextInt();
        System.out.println("Enter your password");
        int passw = sl.nextInt();
        System.out.println();

        System.out.println("Login Success and welcome to XXX Bank");





    }

    public void deposit() {
        System.out.println("you can deposit your cash");
        System.out.println("Enter the Amount");
        Scanner sa = new Scanner(System.in);
        double depositamount = sa.nextDouble();
        currentbalance = depositamount + amount ;
        System.out.println("your Current Balance is " + currentbalance);


    }

    public void withdrawal() {

        Scanner sa = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn ");
        double withdraw = sa.nextDouble();
        currentbalance= currentbalance -  withdraw;
        if (withdraw > amount) {
            System.out.println("you have Insufficient balance" + "on"  + date);
        } else {
            System.out.println("Your balance after withdrawal is :" + currentbalance +  "on " +date);

        }


    }
    public void setDate()
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);

    }



}



