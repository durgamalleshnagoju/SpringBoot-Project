package com.example.SpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class studentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add_Student")
    public ResponseEntity addStudent(@RequestBody Student student){
        String result = studentService.addStudent(student);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/get_Student")
    public ResponseEntity getStudent(@RequestParam("admNo") int admNo){

        String result = studentService.getStudent(admNo);
        if("Invalid Student Id".equals(result)){
            return new ResponseEntity(result, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }

    @DeleteMapping("/delete_Student")
    public ResponseEntity deleteStudent(@RequestParam("admNo") int admNo){
        String result =  studentService.deleteStudent(admNo);
        if("Invalid Student Id".equals(result)){
            return new ResponseEntity(result, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.FOUND);
    }
    @PutMapping("update_Student")
    public ResponseEntity updateStudent(@RequestParam("admNo") int admNo, @RequestParam("age") int age){
        String result = studentService.updateStudentAge(admNo,age);
        if("Invalid Student Id".equals(result)){
            return new ResponseEntity(result, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

}
