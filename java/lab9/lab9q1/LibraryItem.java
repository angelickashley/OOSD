public class LibraryItem
{
    private String type;
    private String ID;

    public LibraryItem(String type, String ID)
    {
        this.type = type;
        this.ID = ID;
    }

    public String getType()
    {
        return type;
    }

    public String getID()
    {
        return ID;
    }

    @Override
    public String toString()
    {
        return type + " [ID: " + ID + "]";
    }
}
