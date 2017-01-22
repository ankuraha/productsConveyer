package rus.sgb.productsconveyer.model;

import java.util.Set;

/**
 * Created by Serguey777 on 22.01.2017.
 */
public class Office extends ModelObject {
    private String title;
    private Set<Contact> contacts;
    private String description;

    public Office() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addContact(Contact contact) {
        contact.setUser(this);
        contacts.add(contact);
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }


}
