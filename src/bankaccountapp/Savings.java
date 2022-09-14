package bankaccountapp;

public class Savings extends Account{
    //list properties specific to the savings account
    private int safetyDepositBoxID;
    private int getSafetyDepositBoxKey;

    //constructor to initise settings for savings properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1"+accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate()-.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
        getSafetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
    }

    //list any methods specific to savings acc
    public void showInfo(){
        super.showInfo();
        System.out.println(
                        "Your Savings Account Features:"+
                        "\n - Safety Deposit Box ID: " + safetyDepositBoxID+
                        "\n - Safety Deposit Box Key: " + getSafetyDepositBoxKey +
                        "\n - Rate: " + rate + "%"
        );
    }



}
