public interface ImportDuty
{
    // Fields in an interface are implicitly public static final (constants)
    double CARTAXRATE = 0.10;
    double HGVTAXRATE = 0.15;

    double calculateDuty();
}
