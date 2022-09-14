package bankaccountapp;

public class Savings extends Account{
    //list properties specific to the savings account
    int safetyDepositBoxID;
    int getSafetyDepositBoxKey;

    //constructor to initise settings for savings properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1"+accountNumber;
        System.out.println("Savings Acc num: " + this.accountNumber);
        System.out.println("New Savings Acc");

    }
    //list any methods specific to savings acc
}
