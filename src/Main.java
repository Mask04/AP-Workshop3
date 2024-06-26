import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String group;
        String email;
        String countryCode;
        String phoneNumber;
        String zipCode;
        String country;
        String city;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        ArrayList<Contact> contacts = new ArrayList<>();
        PhoneBook myPhoneBook = new PhoneBook(contacts);
        while(!str.equals("exit")){
            String [] str2 = str.split(" ");
            switch (str2[0]) {
                case "contacts-a": {
                    System.out.println("please enter contact's group");
                    group = scan.nextLine();
                    System.out.println("please enter contact's email");
                    email = scan.nextLine();
                    System.out.println("please enter contact's countryCode");
                    countryCode = scan.nextLine();
                    System.out.println("please enter contact's phoneNumber");
                    phoneNumber = scan.nextLine();
                    while (phoneNumber.length() != 10) {
                        System.out.println("invalid number");
                        System.out.println("please enter contact's phoneNumber");
                        phoneNumber = scan.nextLine();
                    }
                    System.out.println("please enter contact's zipCode");
                    zipCode = scan.nextLine();
                    System.out.println("please enter contact's country");
                    country = scan.nextLine();
                    System.out.println("please enter contact's city");
                    city = scan.nextLine();
                    Contact contact = new Contact(group, email, str2[1], str2[2], countryCode, phoneNumber
                            , zipCode, country, city);

                    if (myPhoneBook.addContact(contact))
                        System.out.println("success");
                    else
                        System.out.println("duplicate-id");
                    break;
                }
                case "contacts-r":
                    if (myPhoneBook.deleteContact(str2[1], str2[2]))
                        System.out.println("success");
                    else
                        System.out.println("not-found");
                    break;
                case "show-g":
                    ArrayList<Contact> sameGroup = myPhoneBook.findContacts(str2[1]);
                    if (sameGroup.size() == 0) {
                        System.out.println("not-found");
                    }
                    for (Contact contact : sameGroup) {
                        contact.print();
                    }
                    break;
                case "show-c": {
                    Contact contact = myPhoneBook.findContact(str2[1], str2[2]);
                    if (contact == null) {
                        System.out.println("not-found");
                    } else
                        contact.print();
                    break;
                }
                case "show":
                    myPhoneBook.printContacts();
                    break;
            }
            str = scan.nextLine();
        }
    }
}