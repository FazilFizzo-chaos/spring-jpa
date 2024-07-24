package com.fazil.learn_spring.learnspring_jpa.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;

@Column(name="CourseName")
    private String name;

    private String author;

    public Course() {

    }

    public Course(long id, String name, String author){
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Course [id=" +id + ", name=" + name + ", author=" + author + "]";
    }
}
