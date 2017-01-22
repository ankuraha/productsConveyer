package rus.sgb.productsconveyer.model;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by Serguey777 on 22.01.2017.
 * Super class for any object in model. It contains the fields for collect statistic and statuses.
 * The status field values:
 *  0 - active row
 *  1 - deleted row
 *  2 - archived row
 * The hashValue field used for fix invariability for the object in base.
 * Objects are equals if their ids equals.
 */
public class ModelObject implements Serializable {
    protected int id;
    protected int status;
    protected User creator;
    protected Calendar timeCreate;
    protected int hashValue;

    public ModelObject() {
        this.status = 0;
    }

    public ModelObject(int id) {
        this.id = id;
        this.status = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Calendar getTimeCreate() {
        return timeCreate;
    }

    public void setTimeCreate(Calendar timeCreate) {
        this.timeCreate = timeCreate;
    }

    public int getHashValue() {
        return hashValue;
    }

    public void setHashValue(int hashValue) {
        this.hashValue = hashValue;
    }

    public void calcHashValue() {
        int hv = id;
        hv = 31 * hv + status;
        hv = 31 * hv + (creator != null ? creator.hashCode() : 0);
        hv = 31 * hv + (timeCreate != null ? timeCreate.hashCode() : 0);
        hv = 31 * hv + hashValue;
        this.hashValue = hv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelObject that = (ModelObject) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
