package collections.task2;

import java.util.Objects;

public class Author {

    String name;
    String lastName;
    Gender gender;

    public Author(String name, String lastName, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (!Objects.equals(name, author.name)) return false;
        if (!Objects.equals(lastName, author.lastName)) return false;
        return gender == author.gender;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
