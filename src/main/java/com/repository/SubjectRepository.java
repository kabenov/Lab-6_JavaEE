package com.repository;

import com.database.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectRepository {

    List<Subject> findAllSubjects();

    Optional<Subject> findByName(String name);

    Optional<Subject> findById(Integer id);

    List<Subject> findByYear(Integer year);

}
