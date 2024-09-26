package SpringORM.com.entites;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_product")
public class Product {

    @Id
    private String pid;
   private   String pname;
   @ManyToMany(mappedBy = "products",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   private List<Category> categories=new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Product(String pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    public Product() {
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }


}
