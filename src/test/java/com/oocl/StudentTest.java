package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void should_return_correct_student_introduce() {
        Student student = new Student();
        student.setName("Matt");
        student.setAge(18);

        Assert.assertEquals("My name is Matt. I am 18 years old. Coding for the glory of OOCL.", student.introduce());
    }
}