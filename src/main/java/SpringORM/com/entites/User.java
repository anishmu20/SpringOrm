package SpringORM.com.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "User_Id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "User_name",length = 100)
    private String name;
    @Column(name = "User_city",length = 50)
    private String city;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "User_age",length = 2)
    private int age;

    public User(int id, String name, String city, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }





}
