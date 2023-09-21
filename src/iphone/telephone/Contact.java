package iphone.telephone;

import org.jetbrains.annotations.NotNull;

public class Contact implements Comparable<Contact> {
    private String name;
    private int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Contact c) {
        return name.compareTo(c.getName());
    }
}
