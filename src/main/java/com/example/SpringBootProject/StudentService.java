package com.example.SpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String getStudent(int admNo){
        return studentRepository.getStudent(admNo);
    }

    public String addStudent(Student student){
        return studentRepository.addStudent(student);
    }
    public String updateStudentAge(int admNo, int age){
        return studentRepository.updateStudentAge(admNo, age);
    }

    public String deleteStudent(int admNo){
        return studentRepository.deleteStudent(admNo);
    }

}
