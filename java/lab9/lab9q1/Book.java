public class Book extends LibraryItem implements LoanItem
{
    private String author;
    private String title;
    private int numPages;

    public Book(String ID, String author, String title, int numPages)
    {
        super("Book", ID);
        this.author = author;
        this.title = title;
        this.numPages = numPages;
    }

    // Loan price: 1.50 flat fee plus 0.5 cent per page
    @Override
    public double calculatePrice()
    {
        return 1.50 + (numPages * 0.005);
    }

    @Override
    public String toString()
    {
        return super.toString() + " \"" + title + "\" by " + author + ", " + numPages + " pages";
    }
}
