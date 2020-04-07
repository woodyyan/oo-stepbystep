package com.oocl;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void should_return_introduce_with_name_and_age() {
        Person person = new Person();
        person.setName("Tom");
        person.setAge(18);

        Assert.assertEquals("My name is Tom. I am 18 years old.", person.introduce());
    }
}