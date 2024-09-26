package SpringORM.com.entites;

import jakarta.persistence.*;

@Entity
@Table
public class Laptop {
    @Id
    private int laptop_id;
    private  String laptop_model;
    private String laptop_name;

    @OneToOne(mappedBy = "laptop",cascade = CascadeType.ALL)
    private Student student;



    public Laptop() {
    }

    public int getLaptop_id() {
        return laptop_id;
    }

    public void setLaptop_id(int laptop_id) {
        this.laptop_id = laptop_id;
    }

    public String getLaptop_model() {
        return laptop_model;
    }

    public void setLaptop_model(String laptop_model) {
        this.laptop_model = laptop_model;
    }

    public String getLaptop_name() {
        return laptop_name;
    }

    public Laptop(int laptop_id, String laptop_model, String laptop_name, Student student) {
        this.laptop_id = laptop_id;
        this.laptop_model = laptop_model;
        this.laptop_name = laptop_name;
        this.student = student;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setLaptop_name(String laptop_name) {
        this.laptop_name = laptop_name;
    }
}
