package by.vladiyss.railway.domain.railwayCar;

import by.vladiyss.railway.Runner;
import by.vladiyss.railway.domain.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class PassengerRailwayCar extends RailwayCar {

    private final int seatsNumber;
    private final List<Ticket> tickets = new ArrayList<>();

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public List<Ticket> getTickets() {
        return new ArrayList<>(tickets);
    }

    public PassengerRailwayCar(UUID id, String vin, RailwayCarBrand brand, int seatsNumber) {
        super(id, vin, brand);
        this.seatsNumber = seatsNumber;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public void setTickets(Ticket ticket) {
        this.tickets.add(ticket);
    }

    @Override
    public String toString() {
        return super.toString() + "PassengerRailwayCar: " + "seatsNumber=" +
                seatsNumber + ", tickets=" + tickets + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PassengerRailwayCar that = (PassengerRailwayCar) o;
        return seatsNumber == that.seatsNumber && Objects.equals(tickets, that.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatsNumber, tickets);
    }
}
