package oop_lab_tasks;

public interface Banking_System {
       
    void createAccount();
    void searchAccountDetails();
    void updateCustInfo();
    void cashWithdraw(int w) throws Exception;
    void cashDeposit(int d) throws Exception;
}
