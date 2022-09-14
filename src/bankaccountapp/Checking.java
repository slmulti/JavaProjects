package bankaccountapp;

public class Checking extends Account {
    //list properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    //constructor to initalise checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2"+accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate() {
        rate = getBaseRate()*.15;
    }

    //list METHODS specific to checking account

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random()*Math.pow(10,12));
        debitCardPin = (int) (Math.random()*Math.pow(10,4));

    }

    public void showInfo(){
        super.showInfo();
        System.out.println(
                "Your Checking Account Features:"+
                        "\n - Debit Card Number: " + debitCardNumber+
                        "\n - Debit Card Pin: " + debitCardPin+
                        "\n - Rate: " + rate + "%"
        );
    }
}
