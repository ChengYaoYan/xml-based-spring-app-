package dev.llf.course;

import java.util.List;

public class Course implements CourseImpl<String> {
    private List<String> courses;

    public Course(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public List<String> list() {
        return this.courses;
    }
}
