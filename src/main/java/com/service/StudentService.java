package com.service;

import com.database.Student;
import com.database.Subject;
import com.repository.StudentRepository;
import com.repository.SubjectRepository;

import javax.ejb.Stateful;
import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

@Stateful
public class StudentService {

    @Inject
    private StudentRepository studentRepository;

    @Inject
    private SubjectRepository subjectRepository;


    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentByLastName(String lastName){
        return studentRepository.findByLastName(lastName);
    }

    public Optional<Student> getStudentByFirstName(String firstName){
        return studentRepository.findByFirstName(firstName);
    }

    public Optional<List<Student>> getStudentByGpa(Double gpa){
        return studentRepository.findByGpa(gpa);
    }

    public Optional<List<Student>> getStudentByCity(String city){
        return studentRepository.findByCity(city);
    }

    public Optional<List<Student>> getStudentBySubject(String subjectName){
        Subject subject = null;
        if(subjectRepository.findByName(subjectName).isPresent()){
            subject = subjectRepository.findByName(subjectName).get();
        }
        return studentRepository.findBySubject(subject);
    }

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAllSubjects();
    }

    public Optional<Subject> getSubjectByName(String name){
        return subjectRepository.findByName(name);
    }

    public Optional<Subject> getSubjectById(Integer id){
        return subjectRepository.findById(id);
    }

    public List<Subject> getSubjectByYear(Integer id){
        return subjectRepository.findByYear(id);
    }

}
