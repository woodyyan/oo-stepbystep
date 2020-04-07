package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void should_return_correct_teacher_introduce() {
        Teacher teacher = new Teacher();
        teacher.setName("Woody");
        teacher.setAge(18);

        Assert.assertEquals("My name is Woody. I am 18 years old. Teaching for the future of world.", teacher.introduce());
    }
}