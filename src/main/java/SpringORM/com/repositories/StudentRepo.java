package SpringORM.com.repositories;

import SpringORM.com.entites.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
