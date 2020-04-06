package com.oocl;

public class Student extends Person {

    private int klassNumber;

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.klassNumber);
    }

    public int getKlass() {
        return klassNumber;
    }

    public void setKlass(int klass) {
        this.klassNumber = klass;
    }
}
