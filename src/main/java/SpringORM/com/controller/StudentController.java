package SpringORM.com.controller;

import SpringORM.com.entites.Student;
import SpringORM.com.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepo studentRepo;

    @PostMapping("/save")
    public ResponseEntity<String> saveBody(@RequestBody Student student){
        studentRepo.save(student);
        return ResponseEntity.ok("DATA SAVED");
    }

    @GetMapping("/getstudent/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable int id) {
        Student student = studentRepo.findById(id).orElseThrow(()->new RuntimeException("student with this is id is not present "));
        return  ResponseEntity.ok(student);
    }


}
