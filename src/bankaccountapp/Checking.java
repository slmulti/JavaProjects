package bankaccountapp;

public class Checking extends Account {
    //list properties specific to checking account
    int debitCardNumber;
    int debitCardPin;

    //constructor to initalise checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2"+accountNumber;
        System.out.println("Checking Acc num: " + this.accountNumber);
        System.out.println("New Checking Acc");
    }

    //list METHODS specific to checking account
}
