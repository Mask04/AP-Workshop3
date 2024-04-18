import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook {
    private ArrayList <Contact> contacts;
    public PhoneBook(ArrayList<Contact> contacts){
        this.contacts = new ArrayList<>();
    }
    public boolean addContact(Contact newContact){
        for ( Contact contact: contacts){
            if (contact.equals(newContact)){
                return false;
            }
        }
        contacts.add(newContact);
        return true;
    }

    public boolean deleteContact(String firstName , String lastName){
        Iterator <Contact> it = contacts.iterator();
        while (it.hasNext()){
            Contact contact = it.next();
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
                it.remove();
                return true;
            }
        }
        return false;
    }

    public Contact findContact(String firstName , String lastName){
        for (Contact contact : contacts){
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName))
                return contact;
        }
        return null;
    }

    public ArrayList<Contact> findContacts(String group){
        ArrayList<Contact> sameGroup = new ArrayList<>();
        for (Contact contact : contacts){
            if (contact.getGroup().equals(group)) {
                sameGroup.add(contact);
            }
        }
        if(contacts.size() == 0){
            return  null;
        }
        else
            return sameGroup;

    }

    public void printContacts(){
        if (contacts.size() == 0){
            System.out.println("empty list");
        }
        for (Contact contact : contacts) {
            contact.print();
        }

    }
}
