package SpringORM.com.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_address")
public class Address {

    @Id
    private int address_id;
    private String street;
    private String city;
    private String country;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;


    public Address(int address_id, String street, String city, String country, Student student) {
        this.address_id = address_id;
        this.street = street;
        this.city = city;
        this.country = country;
        this.student = student;
    }

    public Address() {
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
