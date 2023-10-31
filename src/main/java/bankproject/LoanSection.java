package bankproject;

public class LoanSection {

    public double principalamount;
    public int  loaninterestrate;

    private int creditscore;

    public static int numberofmonths =12;

    private static double due;



    public double loandue;

    public static void calculateinterest(double principalamount,int loaninterestrate)

    {
        double calculate = (principalamount * loaninterestrate * numberofmonths)/100;
        System.out.println("Monthly EMI is"  +  calculate);

    }

    public void personalloan() {

    }

    public void housingloan() {

    }

    public void mortgageloan() {
    }


}
