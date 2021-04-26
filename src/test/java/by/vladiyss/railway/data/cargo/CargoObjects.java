package by.vladiyss.railway.data.cargo;

import by.vladiyss.railway.domain.cargo.Cargo;
import by.vladiyss.railway.domain.cargo.CargoDimensions;
import by.vladiyss.railway.domain.cargo.CargoManufacturer;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CargoObjects {

    public static List<CargoDimensions> getCargoDimensions() {
        final List<CargoDimensions> listOf10CargoDimensions = IntStream.range(0, 10)
                .mapToObj(i -> new CargoDimensions(i*i + 3*i/4 - 7*i/12,
                        i*i + 3*i/4 - 7*i/12,
                        i*i + 3*i/4 - 7*i/12))
                .collect(Collectors.toList());
        return listOf10CargoDimensions;
    }

    public static List<CargoManufacturer> getCargoManufacturers() {
        final List<CargoManufacturer> listOf10CargoManufacturers = IntStream.range(0, 10)
                .mapToObj(i -> new CargoManufacturer(UUID.randomUUID(),
                        "Name #" + i,
                        "Town #" + i))
                .collect(Collectors.toList());
        return listOf10CargoManufacturers;
    }

    public static List<Cargo> getCargos() {
        final List<CargoDimensions> listOf10CargoDimensions = getCargoDimensions();
        final List<CargoManufacturer> listOf10CargoManufacturers = getCargoManufacturers();

        final List<Cargo> listOf10Cargos = IntStream.range(0, 10)
                .mapToObj(i -> new Cargo(UUID.randomUUID(),
                        listOf10CargoDimensions.get(i),
                        listOf10CargoManufacturers.get(i),
                        i*i + 3*i/4 - 7*i/12))
                .collect(Collectors.toList());
        return listOf10Cargos;
    }
}
