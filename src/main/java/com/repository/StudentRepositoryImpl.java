package com.repository;

import com.database.Student;
import com.database.Subject;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentRepositoryImpl implements StudentRepository{

    @Inject
    private Subject subject;

    @Override
    public List<Student> findAll() {
        return Student.getStudents();
    }

    @Override
    public Optional<Student> findByLastName(String lastName) {
        return findAll().stream().filter(s -> lastName.equals(s.getLastName())).findAny();
    }

    @Override
    public Optional<Student> findByFirstName(String firstName) {
        return findAll().stream().filter(s -> firstName.equals(s.getFirstName())).findAny();
    }

    @Override
    public Optional<List<Student>> findByGpa(Double gpa) {
        return Optional.of(findAll().stream().filter(s -> gpa.equals(s.getGpa())).collect(Collectors.toList()));
    }

    @Override
    public Optional<List<Student>> findByCity(String city) {
        return Optional.of(findAll().stream().filter(s -> city.equals(s.getCity())).collect(Collectors.toList()));
    }

    @Override
    public Optional<List<Student>> findBySubject(Subject subject) {
        return Optional.of(findAll().stream().filter(s -> s.getSubjects().contains(subject)).collect(Collectors.toList()));
    }

}
