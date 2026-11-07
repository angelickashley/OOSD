public class CD extends LibraryItem implements LoanItem
{
    private String band;
    private String title;
    private int numTracks;

    public CD(String ID, String band, String title, int numTracks)
    {
        super("CD", ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    // Loan price: 2.00 flat fee plus 25 cent per track
    @Override
    public double calculatePrice()
    {
        return 2.00 + (numTracks * 0.25);
    }

    @Override
    public String toString()
    {
        return super.toString() + " \"" + title + "\" by " + band + ", " + numTracks + " tracks";
    }
}
