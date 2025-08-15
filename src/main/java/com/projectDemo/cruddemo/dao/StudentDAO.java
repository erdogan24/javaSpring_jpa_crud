package com.projectDemo.cruddemo.dao;

import com.projectDemo.cruddemo.entity.Student;

public interface StudentDAO {

    void  save(Student theStudent);

    Student findById(Integer id);
}
