package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void should_return_correct_introduce_given_woody_and_30() {
        Person teacher = new Teacher();
        teacher.setAge(30);
        teacher.setName("Woody");

        Assert.assertEquals("My name is Woody. I am 30 years old. Teaching for the future of world.", teacher.introduce());
    }
}