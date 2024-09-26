package SpringORM.com.repositories;

import SpringORM.com.entites.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepo extends JpaRepository<Laptop,Integer> {
}
