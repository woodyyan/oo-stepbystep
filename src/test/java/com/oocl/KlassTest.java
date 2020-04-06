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

    @Test
    public void should_assign_leader_given_student_is_in_class() {
        Klass klass = new Klass(2);
        Student student = new Student();
        student.setKlassNumber(2);
        klass.assignLeader(student);
        Assert.assertTrue(klass.isLeader(student));
    }

    @Test
    public void should_return_false_when_assign_leader_given_student_is_not_in_class() {
        Klass klass = new Klass(2);
        Student student = new Student();
        student.setKlassNumber(1);
        klass.assignLeader(student);
        Assert.assertFalse(klass.isLeader(student));
    }

    @Test
    public void should_assign_teacher_given_teacher() {
        Klass klass = new Klass(2);
        Teacher teacher = new Teacher();
        klass.assignTeacher(teacher);
        Assert.assertTrue(klass.isTeacherOfThisClass(teacher));
    }
}