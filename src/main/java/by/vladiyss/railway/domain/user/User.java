package by.vladiyss.railway.domain.user;

import by.vladiyss.railway.Runner;

import java.util.Objects;
import java.util.UUID;

public class User {

    private final UUID id;

    private final String firstname;
    private final String lastname;
    private int age;

    private final boolean isMale;

    public UUID getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public User(UUID id, String firstname, String lastname, int age, boolean isMale) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.isMale = isMale;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public User(UUID id, String firstname, String lastname, boolean isMale) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.isMale = isMale;
    }

    public User(User user) {
        this.id = user.getId();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.age = user.getAge();
        this.isMale = user.isMale();
        Runner.logger.debug("Created --- " + this.toString());
    }

    @Override
    public String toString() {
        return "User: " + "id=" + id + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' +
                ", age=" + age + ", isMale=" + isMale + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age &&
                isMale == user.isMale &&
                id.equals(user.id) &&
                firstname.equals(user.firstname) &&
                lastname.equals(user.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, age, isMale);
    }
}
