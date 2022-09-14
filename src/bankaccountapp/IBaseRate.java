package bankaccountapp;

public interface IBaseRate {

    // write a method returns baserate
    default double getBaseRate(){
        return 2.5;
    }

}
