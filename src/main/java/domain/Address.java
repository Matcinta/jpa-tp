package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity

public class Address implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column (length = 512)
    private String details;
    @OneToMany(mappedBy = "address")
    private Set<Contact> contacts;

    public Address() {
    }

    public Address(String details) {
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
