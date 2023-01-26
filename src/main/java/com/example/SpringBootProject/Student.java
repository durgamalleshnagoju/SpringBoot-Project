package com.example.SpringBootProject;

public class Student {

    private int admNo;
    private String name;
    private String state;
    private int age;

    public Student(int admNo, String name, String state, int age) {
        this.admNo = admNo;
        this.name = name;
        this.state = state;
        this.age = age;
    }

    public int getAdmNo() {
        return admNo;
    }

    public void setAdmNo(int admNo) {
        this.admNo = admNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        String string =  "Student id : "+this.getAdmNo()+"\n"
                +"Student Name : "+this.getName()+"\n"
                +"Student Age : "+this.getAge()+"\n"
                +"Student State : "+this.getState();
        return string;
    }
}
