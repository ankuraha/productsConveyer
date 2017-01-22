package rus.sgb.productsconveyer.model;

/**
 * Created by Serguey777 on 22.01.2017.
 */
public class ContactType extends ModelObject {
    private String title;
    private String description;

    public ContactType() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void calcHashValue() {
        super.calcHashValue();
        int hv = this.hashValue;

        hv = 31 * hv + (title != null ? title.hashCode() : 0);
        hv = 31 * hv + (description != null ? description.hashCode() : 0);

        this.hashValue = hv;
    }
}
