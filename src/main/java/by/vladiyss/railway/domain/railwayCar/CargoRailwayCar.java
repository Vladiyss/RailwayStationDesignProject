package by.vladiyss.railway.domain.railwayCar;

import by.vladiyss.railway.Runner;
import by.vladiyss.railway.domain.cargo.Cargo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class CargoRailwayCar extends RailwayCar {

    private final double loadCapacity;
    private final List<Cargo> cargos = new ArrayList<>();

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public List<Cargo> getCargos() {
        return new ArrayList<>(cargos);
    }

    public CargoRailwayCar(UUID id, String vin, RailwayCarBrand brand, double loadCapacity) {
        super(id, vin, brand);
        this.loadCapacity = loadCapacity;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public void setCargos(Cargo cargo) {
        this.cargos.add(cargo);
    }

    @Override
    public String toString() {
        return super.toString() + "CargoRailwayCar: " +
                "loadCapacity=" + loadCapacity + ", cargos=" + cargos + '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CargoRailwayCar that = (CargoRailwayCar) o;
        return Double.compare(that.loadCapacity, loadCapacity) == 0 && Objects.equals(cargos, that.cargos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadCapacity, cargos);
    }
}
