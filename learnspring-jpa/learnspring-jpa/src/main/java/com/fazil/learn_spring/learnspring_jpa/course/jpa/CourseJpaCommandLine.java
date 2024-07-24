package com.fazil.learn_spring.learnspring_jpa.course.jpa;


import com.fazil.learn_spring.learnspring_jpa.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLine implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn AWS", "FIZO"));
        repository.insert(new Course(2, "Learn Git", "Fazil"));
        repository.insert(new Course(3, "Learn Docker", "Veer"));
        repository.insert(new Course(4, "Learn Project Management", "Abbubakar"));

        repository.deleteById(3);
    }
}
