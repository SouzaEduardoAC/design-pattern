package br.com.souzaeduardoac.designpattern.behavioral.nullobject;


class Run {
    public static void main(String[] args) {
        Person person = new RealPerson();
        System.out.println(person.GetName());
        person = new NullPerson();
        System.out.println(person.GetName());
    }
}
