package SpringORM.com.entites;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Student {

    @Id
     private int student_id;

    private String student_name;

     private String about;
     @OneToOne(cascade = CascadeType.ALL )
     @JoinColumn(name = "fk_laptop_id")
     private Laptop laptop;
     @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
     private List<Address> addressList;

    public Student(int student_id, String student_name, String about, Laptop laptop, List<Address> addressList) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.about = about;
        this.laptop = laptop;
        this.addressList = addressList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Student() {
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
