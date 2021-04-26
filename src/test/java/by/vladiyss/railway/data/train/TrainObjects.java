package by.vladiyss.railway.data.train;

import by.vladiyss.railway.data.railwayCar.RailwayCarObjects;
import by.vladiyss.railway.domain.railwayCar.*;
import by.vladiyss.railway.domain.train.Train;

import java.util.List;
import java.util.UUID;

public class TrainObjects {

    public static Train getTrain() {
        final List<PassengerRailwayCar> listOfPassengerRailwayCars = RailwayCarObjects.getPassengerRailwayCars();
        final List<Locomotive> listOfLocomotives = RailwayCarObjects.getLocomotives();

        Train train = new Train(UUID.randomUUID());
        train.setFirst(listOfLocomotives.get(0));
        listOfLocomotives.get(0).setNext(listOfPassengerRailwayCars.get(0));

        listOfPassengerRailwayCars.stream()
                .filter(passengerRailwayCar ->
                        listOfPassengerRailwayCars.indexOf(passengerRailwayCar) != listOfPassengerRailwayCars.size() - 1)
                .forEachOrdered(passengerRailwayCar ->
                        passengerRailwayCar.setNext(
                                listOfPassengerRailwayCars
                                        .get(listOfPassengerRailwayCars.indexOf(passengerRailwayCar) + 1)
                        ));
        listOfPassengerRailwayCars.get(listOfPassengerRailwayCars.size() - 1).setNext(null);
        return train;
    }
}
