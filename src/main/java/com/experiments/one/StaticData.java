package com.experiments.one;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StaticData {

    public List<Student> getStudents(){
        List<Student> studentList= new ArrayList();

            studentList.add(new Student(1, "Sumit"));
            studentList.add(new Student(2, "Anu"));
            studentList.add(new Student(3, "Thiya"));
        return studentList;
    }

}
