package com.gruszka.egrades.Model;

import java.util.ArrayList;

public class Group {
    public String name;
    public ArrayList<Student> students;

    public Group(String name)
    {
        this.name=name;
        students=new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        student.setGroup(this);
        students.add(student);
    }


}
