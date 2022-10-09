package com.experiments.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private StaticData staticData;

    @Cacheable("h")
    @GetMapping(path = "/students")
    public List<Student> getStudents(){
        System.out.println("hit"+System.currentTimeMillis());
        return staticData.getStudents();
    }

    @PatchMapping(path = "/students/{id}")
    public void patchStudents(@RequestBody Student student, @PathVariable Integer id){
        staticData.getStudents().add((student));

    }
}
