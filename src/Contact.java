public class Contact {
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
    public Contact(String group , String email , String firstName , String lastName , String phoneNumber , Address address){
        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address  = address;
    }
}
