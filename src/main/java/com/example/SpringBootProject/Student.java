package com.example.SpringBootProject;

public class Student {

    private int admNo;
    private String name;
    private String state;

    public Student(int admNo, String name, String state) {
        this.admNo = admNo;
        this.name = name;
        this.state = state;
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
}
