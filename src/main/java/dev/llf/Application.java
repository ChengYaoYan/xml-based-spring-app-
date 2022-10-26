package dev.llf;

import dev.llf.course.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

        // retrieve configured instance
        Course course = context.getBean("course", Course.class);

        // use configured instance
        List<String> courseList = course.list();

        System.out.println(courseList);
    }
}
