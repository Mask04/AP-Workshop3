public class Address
{
    private String zipCode;
    private String country;
    private String city;
    public Address(String zipCode , String country , String city){
        if (!zipCode.equals(" "))
            this.zipCode = zipCode;
        else
            this.zipCode = "-";
        if (!country.equals(" "))
            this.country = country;
        else
            this.country = "-";
        if (!zipCode.equals(" "))
            this.city = city;
        else
            this.city = city;
    }

    public String toString(){
        return "zipCode:" + zipCode + "\ncountry:"+ country + "\ncity:" + city;
    }

}
