package com.gruszka.egrades.Model;

public class Grade {
    private Float value;
    private Teacher teacher;
    private Student student;
    private Float weight;


    public Grade(Float value, Teacher teacher, Student student, Float weight) {
        this.value = value;
        this.teacher = teacher;
        this.student = student;
        this.weight = weight;
    }


    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
