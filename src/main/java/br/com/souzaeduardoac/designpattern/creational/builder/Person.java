package br.com.souzaeduardoac.designpattern.creational.builder;

class Person {
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final String salutation;
    private final String suffix;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomewOwner;

    private Person(
            final String newLastName,
            final String newFirstName,
            final String newMiddleName,
            final String newSalutation,
            final String newSuffix,
            final String newStreetAddress,
            final String newCity,
            final String newState,
            final boolean newIsFemale,
            final boolean newIsEmployed,
            final boolean newIsHomeOwner) {

        this.lastName = newLastName;
        this.firstName = newFirstName;
        this.middleName = newMiddleName;
        this.salutation = newSalutation;
        this.suffix = newSuffix;
        this.streetAddress = newStreetAddress;
        this.city = newCity;
        this.state = newState;
        this.isFemale = newIsFemale;
        this.isEmployed = newIsEmployed;
        this.isHomewOwner = newIsHomeOwner;
    }

    static class PersonBuilder {
        private String nestedLastName;
        private String nestedFirstName;
        private String nestedMiddleName;
        private String nestedSalutation;
        private String nestedSuffix;
        private String nestedStreetAddress;
        private String nestedCity;
        private String nestedState;
        private boolean nestedIsFemale;
        private boolean nestedIsEmployed;
        private boolean nestedIsHomeOwner;

        PersonBuilder(
                final String newFirstName,
                final String newCity,
                final String newState) {

            this.nestedFirstName = newFirstName;
            this.nestedCity = newCity;
            this.nestedState = newState;
        }

        PersonBuilder withLastName(String newLastName) {
            this.nestedLastName = newLastName;
            return this;
        }

        PersonBuilder withMiddleName(String newMiddleName) {
            this.nestedMiddleName = newMiddleName;
            return this;
        }

        PersonBuilder withSalutation(String newSalutation) {
            this.nestedSalutation = newSalutation;
            return this;
        }

        PersonBuilder withSuffix(String newSuffix) {
            this.nestedSuffix = newSuffix;
            return this;
        }

        PersonBuilder withStreetAddress(String newStreetAddress) {
            this.nestedStreetAddress = newStreetAddress;
            return this;
        }

        PersonBuilder isFemale(boolean newIsFemale) {
            this.nestedIsFemale = newIsFemale;
            return this;
        }

        PersonBuilder isEmployed(boolean newIsEmployed) {
            this.nestedIsEmployed = newIsEmployed;
            return this;
        }

        PersonBuilder isHomeOwner(boolean newIsHomeOwner) {
            this.nestedIsHomeOwner = newIsHomeOwner;
            return this;
        }

        Person createPerson() {
            return new Person(nestedLastName,
                    nestedFirstName,
                    nestedMiddleName,
                    nestedSalutation,
                    nestedSuffix,
                    nestedStreetAddress,
                    nestedCity,
                    nestedState,
                    nestedIsFemale,
                    nestedIsEmployed,
                    nestedIsHomeOwner);
        }
    }
}