package com.example.SpringBootProject;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class studentController {
    Map<Integer, Student> dB = new HashMap<Integer, Student>();

    @PostMapping("/add_Student")
    public String addStudent(@RequestBody Student student){
        dB.put(student.getAdmNo(), student);
        return "Student added successfully";
    }

    @GetMapping("/get_Student")
    public Student getStudent(@RequestParam("admNo") int admNo){
        return dB.get(admNo);
    }

    @GetMapping("/get_StudentByName")
    public Student getStudentByName(@RequestParam("admNo") String name){
        for(int admNo : dB.keySet()){
            if((dB.get(admNo).getName()).equals(name)){
                return dB.get(admNo);
            }
        }
        return null;
    }

    @DeleteMapping("/delete_Student")
    public String delStudent(@RequestParam("query") int admNo){
        dB.remove(admNo);
        return "Student removed Successfully";
    }
    @PutMapping("put_Student")
    public String putStudent(@RequestParam("admNo") int admNo, @RequestParam("newState") String newState){
        dB.get(admNo).setState(newState);
        return "Student address changed successfully";
    }

}
