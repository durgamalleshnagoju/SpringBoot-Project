package com.example.SpringBootProject;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {

    HashMap<Integer, Student> db = new HashMap<>();

    public String addStudent(Student student){
        db.put(student.getAdmNo(), student);
        return "Student added Successfully!";
    }

    public String deleteStudent(int admNo){
        if(!db.containsKey(admNo)){
            return "Invalid Student Id";
        }
        db.remove(admNo);
        return "Student details removed Successfully!";
    }
    public String updateStudentAge(int admNo, int age){
        if(!db.containsKey(admNo)){
            return "Invalid Student Id";
        }
        db.get(admNo).setAge(age);
        return "Student age updated Successfully !";
    }
    public String getStudent(int admNo){
        if(!db.containsKey(admNo)){
            return "Invalid Student Id";
        }
        return db.get(admNo).toString();
    }

}
