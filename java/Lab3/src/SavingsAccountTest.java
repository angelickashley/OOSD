public class SavingsAccountTest {
    public static void main (String[] args){
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        //4% interest
        SavingsAccount.modifiedInterest(0.04);
        System.out.println("Rate: 4%");
        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();
        printBalance(saver1, saver2);

        //5% interest
        SavingsAccount.modifiedInterest(0.05);
        System.out.println("Rate: 5%");
        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();
        printBalance(saver1, saver2);

    }
    private static void printBalance(SavingsAccount s1, SavingsAccount s2){
        System.out.printf("Savings 1(#%d): €%.2f%n", s1.getAccountNo(), s1.getSavingBalance());
        System.out.printf("Savings 2(#%d): €%.2f%n", s2.getAccountNo(), s2.getSavingBalance());
    }
}