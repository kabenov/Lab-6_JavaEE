package com.database;

import java.util.Arrays;
import java.util.List;

public class Subject {
    private Integer id;
    private String name;
    private Integer year;

    public Subject() {
    }
    public static SubjectBuilder subjectBuilder(){
        return new Subject().new SubjectBuilder();
    }

    public class SubjectBuilder{
        private SubjectBuilder(){

        }
        public SubjectBuilder id(Integer id){
            Subject.this.id = id;
            return this;
        }
        public SubjectBuilder name(String name){
            Subject.this.name = name;
            return this;
        }
        public SubjectBuilder studentId(Integer year){
            Subject.this.year = year;
            return this;
        }
        public Subject build(){
            return Subject.this;
        }
    }

    public static List<Subject> getSubjects(){
        Subject subject1 =  Subject.subjectBuilder()
                .id(111)
                .name("Java")
                .studentId(2020)
                .build();

        Subject subject2 =  Subject.subjectBuilder()
                .id(112)
                .name("Python")
                .studentId(2021)
                .build();

        Subject subject3 =  Subject.subjectBuilder()
                .id(113)
                .name("C++")
                .studentId(2019)
                .build();

        Subject subject4 =  Subject.subjectBuilder()
                .id(114)
                .name("Python")
                .studentId(2018)
                .build();

        Subject subject5 =  Subject.subjectBuilder()
                .id(115)
                .name("JavaScript")
                .studentId(2016)
                .build();

        Subject subject6 =  Subject.subjectBuilder()
                .id(116)
                .name("PhP")
                .studentId(2019)
                .build();

        Subject subject7 =  Subject.subjectBuilder()
                .id(117)
                .name("Swift")
                .studentId(2013)
                .build();

        Subject subject8 =  Subject.subjectBuilder()
                .id(118)
                .name("C#")
                .studentId(2015)
                .build();

        Subject subject9 =  Subject.subjectBuilder()
                .id(119)
                .name("Go")
                .studentId(2018)
                .build();

        Subject subject10 =  Subject.subjectBuilder()
                .id(120)
                .name("C")
                .studentId(2000)
                .build();

        Subject subject11 =  Subject.subjectBuilder()
                .id(121)
                .name("Kotlin")
                .studentId(2011)
                .build();

        Subject subject12 =  Subject.subjectBuilder()
                .id(122)
                .name("Pascal")
                .studentId(1990)
                .build();

        return Arrays.asList(subject1, subject2, subject3, subject4, subject5, subject6,
                subject7, subject8, subject9, subject10, subject11, subject12);
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
