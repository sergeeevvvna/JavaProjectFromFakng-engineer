package org.hogwarts.collection;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {
    private int years;
    private String faculty;
    private String name;

    public Student(String name, String faculte, int years) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }


    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void FacultyPair(String faculty, int years) {
        this.faculty = faculty;
        this.years = years;
    }

    public int hashCode() {
        return Objects.hash(faculty, years);
    }

    public void addStudent(Student student){
        addStudent(student);
    }
    public  void removeStudent(String name, String faculty, int years){
        removeStudent(name,faculty,years);
    }
    ArrayList<Student> students = new ArrayList<>();
    public ArrayList<Student> findStudentsByFacultyAndYear(String faculty, int year) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty) && student.getYears() == year) {
                result.add(student);
            }
        }
        return result;
    }

}
