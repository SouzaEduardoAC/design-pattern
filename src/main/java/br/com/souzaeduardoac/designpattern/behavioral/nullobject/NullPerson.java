package br.com.souzaeduardoac.designpattern.behavioral.nullobject;

class NullPerson extends Person {
    @Override
    public String GetName() {
        return "Invalid Person";
    }
}
