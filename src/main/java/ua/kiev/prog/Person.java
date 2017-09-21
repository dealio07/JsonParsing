package ua.kiev.prog;

import java.util.Arrays;

public class Person {
    public String name;
    public String surname;
    public String[] phones;
    public String[] sites;
    public Address address;

    @Override
    public String toString() {
        return "Person from person.json:{\n" +
                "name='" + name + '\'' +
                ",\n surname='" + surname + '\'' +
                ",\n phones=" + Arrays.toString(phones) +
                ",\n sites=" + Arrays.toString(sites) +
                ",\n address=" + address +
                '}';
    }

}
