package rus.sgb.productsconveyer.model;

/**
 * Created by Serguey777 on 22.01.2017.
 */
public class Contact extends ModelObject {
    private User user;
    private ContactType contactType;
    private String value;

    public Contact() {
        super();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public void calcHashValue() {
        super.calcHashValue();
        int hv = this.hashValue;

        hv = 31 * hv + (user != null ? user.hashCode() : 0);
        hv = 31 * hv + (contactType != null ? contactType.hashCode() : 0);
        hv = 31 * hv + (value != null ? value.hashCode() : 0);

        this.hashValue = hv;
    }
}
