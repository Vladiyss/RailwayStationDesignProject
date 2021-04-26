package by.vladiyss.railway.domain.railwayCar;

import by.vladiyss.railway.Runner;

import java.util.Objects;
import java.util.UUID;

public class RailwayCarBrand {

    private final UUID id;
    private final String name;
    private final String country;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public RailwayCarBrand(UUID id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public RailwayCarBrand(RailwayCarBrand railwayCarBrand) {
        this.id = railwayCarBrand.getId();
        this.name = railwayCarBrand.getName();
        this.country = railwayCarBrand.getCountry();
        Runner.logger.debug("Created --- " + this.toString());
    }

    @Override
    public String toString() {
        return "RailwayCarBrand: " + "id=" + id + ", name='" + name + '\'' + ", country='" + country + '\'' + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RailwayCarBrand that = (RailwayCarBrand) o;
        return id.equals(that.id) && name.equals(that.name) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country);
    }
}
