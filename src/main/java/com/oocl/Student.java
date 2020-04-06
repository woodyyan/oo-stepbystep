package com.oocl;

public class Student extends Person {

    private int klass;

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a student of class %s. Coding for the glory of OOCL.", this.getName(), this.getAge(), this.klass);
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }
}
