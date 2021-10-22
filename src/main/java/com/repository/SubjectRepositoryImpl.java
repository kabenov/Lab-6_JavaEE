package com.repository;

import com.database.Subject;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SubjectRepositoryImpl implements SubjectRepository{

    @Override
    public List<Subject> findAllSubjects() {
       return Subject.getSubjects();
    }

    @Override
    public Optional<Subject> findByName(String name) {
        return findAllSubjects().stream().filter(s -> name.equals(s.getName())).findAny();
    }

    @Override
    public Optional<Subject> findById(Integer id) {
        return findAllSubjects().stream().filter(s -> id.equals(s.getId())).findAny();
    }

    @Override
    public List<Subject> findByYear(Integer year) {

        return findAllSubjects().stream().filter(s -> year.equals(s.getYear())).collect(Collectors.toList());
    }
}
