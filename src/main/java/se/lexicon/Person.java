package se.lexicon;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private String Lastname;
    private String email;

    // Conructor
    public Person(int id, String name, String lastname, String email) {
        this.id = id;
        this.name = name;
        Lastname = lastname;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getName() {
        return name;
    }

    // Override the Equals method. We use it in the 'CollectionsFramework' class.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name) && Objects.equals(Lastname, person.Lastname) && Objects.equals(email, person.email);
    }
    // Override the Hashcode method we use it in the 'CollectionsFramework' class.
    @Override
    public int hashCode() {
        return Objects.hash(id, name, Lastname, email);
    }

    // Override the toString method we use it in the 'CollectionsFramework' class.
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override //We override the compareTo method we use it in the 'CollectionsFramework' class.
    public int compareTo(Person o) {
        if (this.getId()>o.getId()) {
            return 1; // The current object come after input object when sorted.
        }else if (this.getId() < o.getId()) {
            return -1;
        }else {
            return 0;
        }
    } // End of Method

} // End of Class
