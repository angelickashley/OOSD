public class LibraryDriver
{
    public static void main(String[] args)
    {
        LibraryItem[] items = new LibraryItem[4];
        items[0] = new Book("B001", "Joshua Bloch", "Effective Java", 416);
        items[1] = new CD("C001", "Daft Punk", "Discovery", 14);
        items[2] = new Book("B002", "Robert Martin", "Clean Code", 464);
        items[3] = new CD("C002", "Radiohead", "OK Computer", 12);

        for (LibraryItem item : items)
        {
            System.out.println(item);
            // Only items that implement LoanItem have a price
            if (item instanceof LoanItem)
            {
                LoanItem loan = (LoanItem) item;
                System.out.printf("  Loan price: EUR %.2f%n", loan.calculatePrice());
            }
        }
    }
}
