public class Address
{
    private String zipCode;
    private String country;
    private String city;
    public Address(String zipCode , String country , String city){
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
    }

    public String ToString(){
        return "zipCode:" + zipCode + "\ncountry:"+ country + "\ncity:" + city;
    }

}
