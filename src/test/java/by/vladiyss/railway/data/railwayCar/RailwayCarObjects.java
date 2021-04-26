package by.vladiyss.railway.data.railwayCar;

import by.vladiyss.railway.data.user.UserObjects;
import by.vladiyss.railway.domain.cargo.CargoDimensions;
import by.vladiyss.railway.domain.cargo.CargoManufacturer;
import by.vladiyss.railway.domain.railwayCar.CargoRailwayCar;
import by.vladiyss.railway.domain.railwayCar.Locomotive;
import by.vladiyss.railway.domain.railwayCar.PassengerRailwayCar;
import by.vladiyss.railway.domain.railwayCar.RailwayCarBrand;
import by.vladiyss.railway.domain.user.TrainDriver;
import by.vladiyss.railway.domain.user.User;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RailwayCarObjects {

    public static List<RailwayCarBrand> getRailwayCarBrands() {
        final List<RailwayCarBrand> listOf5RailwayCarBrands = IntStream.range(0, 5)
                .mapToObj(i -> new RailwayCarBrand(UUID.randomUUID(),
                        "Name #" + i,
                        "Town #" + i))
                .collect(Collectors.toList());
        return listOf5RailwayCarBrands;
    }

    public static List<PassengerRailwayCar> getPassengerRailwayCars() {
        final List<RailwayCarBrand> listOfRailwayCarBrands = getRailwayCarBrands();

        final List<PassengerRailwayCar> listOf20PassengerRailwayCars = IntStream.range(0, 20)
                .mapToObj(i -> new PassengerRailwayCar(UUID.randomUUID(),
                        "Vin #" + i,
                        listOfRailwayCarBrands.get(i % 5),
                        i + 20))
                .collect(Collectors.toList());
        return listOf20PassengerRailwayCars;
    }

    public static List<CargoRailwayCar> getCargoRailwayCars() {
        final List<RailwayCarBrand> listOfRailwayCarBrands = getRailwayCarBrands();

        final List<CargoRailwayCar> listOf20CargoRailwayCars = IntStream.range(0, 20)
                .mapToObj(i -> new CargoRailwayCar(UUID.randomUUID(),
                        "Vin #" + i,
                        listOfRailwayCarBrands.get(i % 5),
                        i + 2000))
                .collect(Collectors.toList());
        return listOf20CargoRailwayCars;
    }

    public static List<Locomotive> getLocomotives() {
        final List<RailwayCarBrand> listOfRailwayCarBrands = getRailwayCarBrands();
        final List<TrainDriver> listOfTrainDrivers = UserObjects.getTrainDrivers();

        final List<Locomotive> listOf5Locomotives = IntStream.range(0, 5)
                .mapToObj(i -> new Locomotive(UUID.randomUUID(),
                        "Vin #" + i,
                        listOfRailwayCarBrands.get(i % 5),
                        listOfTrainDrivers.get(i)))
                .collect(Collectors.toList());
        return listOf5Locomotives;
    }
}
