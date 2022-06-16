package com.gruszka.egrades.Model;

import java.util.ArrayList;

public class Student {

    private String name;
    private String surname;
    private Group group;
    private ArrayList<Grade> grades;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;

        grades=new ArrayList<>();
    }


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void addGrade(Grade grade)
    {
        grade.setStudent(this);
        grades.add(grade);
    }
}
