package com.oocl;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private List<Student> students;
    private Student leader;

    public Klass(int number) {
        this.number = number;
        this.students = new ArrayList<Student>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void appendMember(Student student) {
        if (student.getKlassNumber() != number) {
            this.students.add(student);
        }
    }

    public boolean contains(Student student) {
        return students.contains(student);
    }

    public void assignLeader(Student student) {
        if (student.getKlassNumber() == this.number) {
            this.leader = student;
        }
    }

    public boolean isLeader(Student student) {
        return leader == student;
    }
}
