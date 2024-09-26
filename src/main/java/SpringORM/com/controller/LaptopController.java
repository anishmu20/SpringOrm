package SpringORM.com.controller;

import SpringORM.com.entites.Laptop;
import SpringORM.com.entites.Student;
import SpringORM.com.repositories.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @Autowired
    LaptopRepo laptopRepo;
    @PostMapping("/save")
    public ResponseEntity<String > save(@RequestBody Laptop laptop){

        Student  student= laptop.getStudent();
        if (student!=null){
            student.setLaptop(laptop);
        }

        laptopRepo.save(laptop);
        return  ResponseEntity.ok("Data Saved");
    }

}
