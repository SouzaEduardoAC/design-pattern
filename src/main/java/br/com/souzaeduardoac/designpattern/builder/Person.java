package br.com.souzaeduardoac.designpattern.builder;

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

    public static class PersonBuilder {
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

        public PersonBuilder(
                final String newFirstName,
                final String newCity,
                final String newState) {

            this.nestedFirstName = newFirstName;
            this.nestedCity = newCity;
            this.nestedState = newState;
        }

        public PersonBuilder withLastName(String newLastName) {
            this.nestedLastName = newLastName;
            return this;
        }

        public PersonBuilder withMiddleName(String newMiddleName) {
            this.nestedMiddleName = newMiddleName;
            return this;
        }

        public PersonBuilder withSalutation(String newSalutation) {
            this.nestedSalutation = newSalutation;
            return this;
        }

        public PersonBuilder withSuffix(String newSuffix) {
            this.nestedSuffix = newSuffix;
            return this;
        }

        public PersonBuilder withStreetAddress(String newStreetAddress) {
            this.nestedStreetAddress = newStreetAddress;
            return this;
        }

        public PersonBuilder isFemale(boolean newIsFemale) {
            this.nestedIsFemale = newIsFemale;
            return this;
        }

        public PersonBuilder isEmployed(boolean newIsEmployed) {
            this.nestedIsEmployed = newIsEmployed;
            return this;
        }

        public PersonBuilder isHomeOwner(boolean newIsHomeOwner) {
            this.nestedIsHomeOwner = newIsHomeOwner;
            return this;
        }

        public Person createPerson() {
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