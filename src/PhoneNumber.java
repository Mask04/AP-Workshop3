public class PhoneNumber {

    private String countryCode;
    private String number;

    public PhoneNumber(String countryCode , String number){
        this.countryCode = countryCode;
        this.number = number;
    }

    public String toString(){
        return countryCode + number;
    }
}
