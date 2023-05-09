package org.bytetechnology;

import java.util.Objects;

public class Student {
    String regNo;
    String Name;

    public Student() {
    }

    public Student(String regNo, String name) {
        this.regNo = regNo;
        Name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo='" + regNo + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(regNo, student.regNo) && Objects.equals(Name, student.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNo, Name);
    }
}
