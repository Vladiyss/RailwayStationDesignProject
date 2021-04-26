package by.vladiyss.railway.data.ticket;

import by.vladiyss.railway.data.user.UserObjects;
import by.vladiyss.railway.domain.ticket.Ticket;
import by.vladiyss.railway.domain.user.User;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TicketObjects {

    public static List<Ticket> getTickets() {
        final List<User> listOfUsers = UserObjects.getUsers();

        final List<Ticket> listOf20Tickets = IntStream.range(0, 20)
                .mapToObj(i -> new Ticket(UUID.randomUUID(),
                        i,
                        listOfUsers.get(i)))
                .collect(Collectors.toList());
        return listOf20Tickets;
    }
}
