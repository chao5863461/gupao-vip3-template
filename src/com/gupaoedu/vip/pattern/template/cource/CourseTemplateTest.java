package com.gupaoedu.vip.pattern.template.cource;

public class CourseTemplateTest {

    public static void main(String[] args) {
       NetworkCourse course  = new JavaCourse();
       course.createeCourse();

       course = new BigDataCourse(true);
       course.createeCourse();
    }
}
