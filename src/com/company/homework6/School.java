package com.company.homework6;

import java.util.List;

public class School extends Build {
    private String name;
    private String accreditation;
    private List<Student> studentList;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAdress(String adress) {
        super.setAdress(adress);
    }

    @Override
    public void setOpenness(Boolean openness) {
        super.setOpenness(openness);
    }


    public String getName() {
        return name;
    }

    @Override
    public String getAdress() {
        return super.getAdress();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void open() {
        super.open();
    }

    @Override
    public void close() {
        super.close();
    }

    public School configSchool(){
        Student student = new Student();
        return new School("20", "A300", false, "high", student.configStudents());
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", accreditation='" + accreditation + '\'' +
                ", studentList=" + studentList +
                ", adress='" + adress + '\'' +
                ", openness=" + openness +
                '}';
    }

    public School(){

    }

    @Override
    public boolean isOpen() {
        return super.isOpen();
    }

    public School(String name, String adress, Boolean openness, String accreditation, List<Student> studentList) {
        super(adress, openness);
        this.name = name;
        this.accreditation = accreditation;
        this.studentList = studentList;
    }

    public String getAccreditation() {
        return accreditation;
    }

    public void setAccreditation(String accreditation) {
        this.accreditation = accreditation;
    }
}
