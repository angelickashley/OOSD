//Stores full address details for an employee
public class Address {
    private String street;
    private String city;
    private String county;

    //Constructor - sets all address parts
    public Address (String street, String city, String county){
        this.street = street;
        this.city = city;
        this.county = county;
    }
    //Printing address
    @Override
    public String toString(){
        return street + " , " + city + " , " + county;
    }
}