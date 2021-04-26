package by.vladiyss.railway.domain.cargo;

import by.vladiyss.railway.Runner;

import java.util.Objects;
import java.util.UUID;

public class Cargo {

    private final UUID id;
    private final CargoDimensions dimensions;
    private final CargoManufacturer manufacturer;
    private final double weight;

    public UUID getId() {
        return id;
    }

    public CargoDimensions getDimensions() {
        return new CargoDimensions(dimensions);
    }

    public CargoManufacturer getManufacturer() {
        return new CargoManufacturer(manufacturer);
    }

    public double getWeight() {
        return weight;
    }

    public Cargo(UUID id, CargoDimensions dimensions, CargoManufacturer manufacturer, double weight) {
        this.id = id;
        this.dimensions = dimensions;
        this.manufacturer = manufacturer;
        this.weight = weight;
        Runner.logger.debug("Created --- " + this.toString());
    }

    @Override
    public String toString() {
        return "Cargo: " + "id=" + id + ", dimensions=" + dimensions + ", manufacturer=" + manufacturer +
                ", weight=" + weight + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cargo cargo = (Cargo) o;
        return Double.compare(cargo.weight, weight) == 0 &&
                id.equals(cargo.id) &&
                dimensions.equals(cargo.dimensions) &&
                manufacturer.equals(cargo.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dimensions, manufacturer, weight);
    }
}
