package by.vladiyss.railway.domain.cargo;

import by.vladiyss.railway.Runner;

import java.util.Objects;
import java.util.UUID;

public class CargoManufacturer {

    private final UUID id;
    private final String name;
    private final String town;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public CargoManufacturer(UUID id, String name, String town) {
        this.id = id;
        this.name = name;
        this.town = town;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public CargoManufacturer(CargoManufacturer cargoManufacturer) {
        this.id = cargoManufacturer.getId();
        this.name = cargoManufacturer.getName();
        this.town = cargoManufacturer.getTown();
        Runner.logger.debug("Created --- " + this.toString());
    }

    @Override
    public String toString() {
        return "Manufacturer: " + "id=" + id + ", name='" + name + '\'' + ", town='" + town + '\'' + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CargoManufacturer that = (CargoManufacturer) o;
        return id.equals(that.id) && name.equals(that.name) && town.equals(that.town);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, town);
    }
}
