package ec.com.softwareevolutivo.demos.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by fernando on 4/7/17.
 */
@Entity
public class Persona implements Serializable{
    private int id;
    private String firstNames;
    private String lastNames;
    private String address;
    private String phone;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_names")
    public String getFirstNames() {
        return firstNames;
    }

    public void setFirstNames(String firstNames) {
        this.firstNames = firstNames;
    }

    @Basic
    @Column(name = "last_names")
    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (id != persona.id) return false;
        if (firstNames != null ? !firstNames.equals(persona.firstNames) : persona.firstNames != null) return false;
        if (lastNames != null ? !lastNames.equals(persona.lastNames) : persona.lastNames != null) return false;
        if (address != null ? !address.equals(persona.address) : persona.address != null) return false;
        if (phone != null ? !phone.equals(persona.phone) : persona.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (firstNames != null ? firstNames.hashCode() : 0);
        result = 31 * result + (lastNames != null ? lastNames.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
