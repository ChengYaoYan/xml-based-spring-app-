package dev.llf.course;

import java.util.List;

public interface CourseImpl<T> {
    // list all courses
    List<T> list();
}
