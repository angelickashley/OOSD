public class BankCustomerTest {
    public static void main(String[] args){
        BankCustomer customer = new BankCustomer("Alice Smith", "123 Main St, Carlow");
        SavingsAccount acc1 = new SavingsAccount(1500.00);
        SavingsAccount acc2 = new SavingsAccount(2300.50);
        SavingsAccount acc3 = new SavingsAccount(850.75);
        SavingsAccount acc4 = new SavingsAccount(6970.35);

        customer.addAccount(acc1);
        customer.addAccount(acc2);
        customer.addAccount(acc3);
        customer.addAccount(acc4);

        SavingsAccount.modifiedInterest(0.04);
        acc1.calcMonthlyInterest();
        acc2.calcMonthlyInterest();
        acc3.calcMonthlyInterest();
        customer.summary();
    }
}