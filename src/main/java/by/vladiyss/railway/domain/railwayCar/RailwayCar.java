package by.vladiyss.railway.domain.railwayCar;

import java.util.UUID;

public abstract class RailwayCar {

    private final UUID id;
    private final String vin;
    private final RailwayCarBrand brand;

    private RailwayCar next;

    public RailwayCar getNext() {
        return next;
    }

    public void setNext(RailwayCar next) {
        this.next = next;
    }

    public UUID getId() {
        return id;
    }

    public String getVin() {
        return vin;
    }

    public RailwayCarBrand getBrand() {
        return new RailwayCarBrand(brand);
    }

    public RailwayCar(UUID id, String vin, RailwayCarBrand brand) {
        this.id = id;
        this.vin = vin;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "RailwayCar: " + "id=" + id + ", vin='" + vin + '\'' + ", brand=" + brand + '.';
    }
}
