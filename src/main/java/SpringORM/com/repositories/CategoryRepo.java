package SpringORM.com.repositories;

import SpringORM.com.entites.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category,String> {


}
