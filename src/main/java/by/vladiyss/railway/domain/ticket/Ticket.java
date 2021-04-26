package by.vladiyss.railway.domain.ticket;

import by.vladiyss.railway.Runner;
import by.vladiyss.railway.domain.user.User;

import java.util.Objects;
import java.util.UUID;

public class Ticket {

    private final UUID id;
    private final int placeNumber;
    private final User user;

    public UUID getId() {
        return id;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public User getUser() {
        return user;
    }

    public Ticket(UUID id, int placeNumber, User user) {
        this.id = id;
        this.placeNumber = placeNumber;
        this.user = user;
        Runner.logger.debug("Created --- " + this.toString());
    }

    @Override
    public String toString() {
        return "Ticket: " + "id=" + id + ", placeNumber=" + placeNumber + ", user=" + user + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ticket ticket = (Ticket) o;
        return placeNumber == ticket.placeNumber && id.equals(ticket.id) && user.equals(ticket.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, placeNumber, user);
    }
}
