package day35_PracticeTask.bankAccount;

public class BankAccount {

    private  String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String accountHolder, long accountNumber) {
       setAccountHolder(accountHolder);
       setAccountNumber(accountNumber);

    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
        this.accountHolder=accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){

        balance += amount;
    }

    public void withdraw(double amount){
        balance-= amount;
    }

    public void checkBalance(){
        System.out.println("Your balance is= $" + balance);
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("Onur", 123456789);

        System.out.println(bankAccount1);

        bankAccount1.deposit(100);

        System.out.println(bankAccount1);






    }
}


/*
5. create a class named BankAccount
Private variables:
accountHolder, accountNumber, balance
encapsulate all the fields
Add a constructor that allows user to set all the fields when the
object is created.
(If the arguments not valid it should not be set
to the instances)
Extra methods:
deposit()
withdraw()
checkbalance()
toString()
DO NOT duplicate any code fragments
 */