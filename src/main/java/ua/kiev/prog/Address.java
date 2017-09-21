package ua.kiev.prog;

public class Address {
    public String country;
    public String city;
    public String street;

    @Override
    public String toString() {
        return "{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
