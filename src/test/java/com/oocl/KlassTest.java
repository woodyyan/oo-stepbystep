package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class KlassTest {
    @Test
    public void should_append_member_given_student_not_in_class_2() {
        Klass klass = new Klass(2);
        Student student = new Student();
        student.setAge(18);
        student.setName("Tom");
        klass.appendMember(student);

        Assert.assertTrue(klass.contains(student));
    }
}