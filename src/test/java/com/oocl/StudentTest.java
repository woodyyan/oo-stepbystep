package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void should_return_correct_introduce_given_tom_and_18() {
        Student student = new Student();
        student.setName("Tom");
        student.setAge(18);
        student.setKlass(2);

        Assert.assertEquals("My name is Tom. I am 18 years old. I am a student of class 2. Coding for the glory of OOCL.", student.introduce());
    }
}