package br.com.souzaeduardoac.designpattern.builder;

public class Run {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("Eduardo", "Maringá", "Paraná")
                .withMiddleName("Augusto")
                .withLastName("Souza")
                .withSalutation("Hug!")
                .withStreetAddress("Praça Verador Oswaldo Vieira")
                .isHomeOwner(true)
                .isEmployed(true)
                .isFemale(false)
                .createPerson();
    }
}
