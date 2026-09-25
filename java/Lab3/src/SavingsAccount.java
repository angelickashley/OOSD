public class SavingsAccount {
    private static double annualInterestRate = 0;
    private static int nextAccountNo = 1;

    private final int accountNo;
    private double savingBalance;
    public SavingsAccount(double balance){
        savingBalance = balance;
        accountNo = nextAccountNo;
        nextAccountNo += 1;
    }
    public void calcMonthlyInterest(){
        double interest = savingBalance * (annualInterestRate / 12.0);
        savingBalance += interest;
    }
    public static void modifiedInterest(double newRate){
        annualInterestRate = newRate;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public int getAccountNo() {
        return accountNo;
    }
}
