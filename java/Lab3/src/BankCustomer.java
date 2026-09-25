public class BankCustomer {
    private String name, address;
    private SavingsAccount[] accounts;
    private int accCount;

    public BankCustomer(String name, String address){
        this.name = name;
        this.address = address;
        accounts = new SavingsAccount[3];
        accCount = 0;
    }
    public void addAccount(SavingsAccount acc){
        if (accCount < 3){
            accounts[accCount] = acc;
            System.out.println("Account #" + acc.getAccountNo() + " added");
            accCount++;
        }
        else{
            System.out.println("Max 3 accounts: cannot add more");
        }
    }
    public double balance(){
        double total = 0;
        for (int i = 0; i < accCount; i++){
            total += accounts[i].getSavingBalance();
        }
        return total;
    }
    public void summary(){
        System.out.println("\n  " + name);
        System.out.println("Address: " + address);
        for (int i = 0; i < accCount; i++){
            System.out.printf("Acc #%d: €%.2f%n", accounts[i].getAccountNo(), accounts[i].getSavingBalance());
        }
        System.out.printf("Total: €%.2f%n", balance());
    }
}
