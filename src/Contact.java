public class Contact {
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber;
    private Address address;
    public Contact(String group , String email , String firstName , String lastName , String countryCode , String number,
                   String zipCode , String country , String city){
        this.group = group;
        if (!email.equals(" "))
            this.email = email;
        else
            this.email = "-";
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = new PhoneNumber(countryCode , number);
        this.address  = new Address(zipCode ,country , city);
    }

    public void print()
    {
        System.out.println("group:" +group +'\n');
        System.out.println("email:" +email + '\n');
        System.out.println("firstName:" +firstName +'\n');
        System.out.println("lastName:" + lastName + '\n');
        System.out.println("phoneNumber:" + phoneNumber + '\n');
        System.out.println("address:" + address +'\n');
        System.out.println("***********************\n");
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }
}
