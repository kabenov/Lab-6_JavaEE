package com.repository;

import com.database.Student;
import com.database.Subject;

import java.util.List;
import java.util.Optional;

public interface StudentRepository {
    List<Student> findAll();

    Optional<Student> findByLastName(String lastName);

    Optional<Student> findByFirstName(String lastName);

    Optional<List<Student>> findByGpa(Double gpa);

    Optional<List<Student>> findByCity(String city);

    Optional<List<Student>> findBySubject(Subject subject);
}
