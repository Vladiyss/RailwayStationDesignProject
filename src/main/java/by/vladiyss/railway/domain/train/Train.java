package by.vladiyss.railway.domain.train;

import by.vladiyss.railway.Runner;
import by.vladiyss.railway.domain.railwayCar.RailwayCar;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class Train {

    private final UUID id;
    private RailwayCar first;

    public Train(UUID id) {
        this.id = id;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public UUID getId() {
        return id;
    }

    public RailwayCar getFirst() {
        return first;
    }

    public void setFirst(RailwayCar first) {
        this.first = first;
    }

    @Override
    public String toString() {

        StringBuilder resultString = new StringBuilder();
        resultString.append("Train: " + "id=" + id + ", next= ");

        Optional<RailwayCar> currentCar = Optional.of(this.getFirst());
        currentCar.ifPresent(railwayCar -> {
            resultString.append(railwayCar.toString() + " next= ");
            while (railwayCar.getNext() != null) {
                railwayCar = railwayCar.getNext();
                resultString.append(railwayCar.toString() + " next= ");
            }
        });

        return resultString.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Train train = (Train) o;
        return id.equals(train.id) && Objects.equals(first, train.first);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first);
    }
}
