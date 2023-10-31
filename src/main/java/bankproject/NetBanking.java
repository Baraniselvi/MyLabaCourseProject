package bankproject;

import java.util.Date;

public class NetBanking {

    private double amount;

    private double bal;

    private Date date;

    private  String customer;

    public void neft()
    {
        System.out.println("Outbound transactions");
    }
    public void customertransactionhistory()
    {
        System.out.println("Transaction History and statements");
    }
}
