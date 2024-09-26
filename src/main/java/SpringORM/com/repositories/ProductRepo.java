package SpringORM.com.repositories;

import SpringORM.com.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,String> {
}
