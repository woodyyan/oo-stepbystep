package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void should_return_correct_introduce_given_tome_and_18() {
        Person person = new Person();
        person.setAge(18);
        person.setName("Tom");

        Assert.assertEquals("My name is Tom. I am 18 years old.", person.introduce());
    }
}