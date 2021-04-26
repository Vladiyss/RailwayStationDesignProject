package by.vladiyss.railway.data;

import by.vladiyss.railway.data.cargo.CargoObjects;
import by.vladiyss.railway.data.railwayCar.RailwayCarObjects;
import by.vladiyss.railway.data.ticket.TicketObjects;
import by.vladiyss.railway.data.train.TrainObjects;
import by.vladiyss.railway.data.user.UserObjects;
import by.vladiyss.railway.domain.cargo.Cargo;
import by.vladiyss.railway.domain.cargo.CargoDimensions;
import by.vladiyss.railway.domain.cargo.CargoManufacturer;
import by.vladiyss.railway.domain.railwayCar.CargoRailwayCar;
import by.vladiyss.railway.domain.railwayCar.Locomotive;
import by.vladiyss.railway.domain.railwayCar.PassengerRailwayCar;
import by.vladiyss.railway.domain.railwayCar.RailwayCarBrand;
import by.vladiyss.railway.domain.ticket.Ticket;
import by.vladiyss.railway.domain.train.Train;
import by.vladiyss.railway.domain.user.TrainDriver;
import by.vladiyss.railway.domain.user.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TestData {

    @Test
    public void test_getCargoDimensions() {

        final List<CargoDimensions> listOf10CargoDimensions = CargoObjects.getCargoDimensions();
        assertThat(10, equalTo(listOf10CargoDimensions.size()));
    }

    @Test
    public void test_getCargoManufacturers() {

        final List<CargoManufacturer> listOf10CargoManufacturers = CargoObjects.getCargoManufacturers();
        assertThat(10, equalTo(listOf10CargoManufacturers.size()));
    }

    @Test
    public void test_getCargos() {

        final List<Cargo> listOf10Cargos = CargoObjects.getCargos();
        assertThat(10, equalTo(listOf10Cargos.size()));
    }



    @Test
    public void test_getRailwayCarBrands() {

        final List<RailwayCarBrand> listOf5RailwayCarBrands = RailwayCarObjects.getRailwayCarBrands();
        assertThat(5, equalTo(listOf5RailwayCarBrands.size()));
    }

    @Test
    public void test_getPassengerRailwayCars() {

        final List<PassengerRailwayCar> listOf20PassengerRailwayCars = RailwayCarObjects.getPassengerRailwayCars();
        assertThat(20, equalTo(listOf20PassengerRailwayCars.size()));
    }

    @Test
    public void test_getCargoRailwayCars() {

        final List<CargoRailwayCar> listOf20CargoRailwayCars = RailwayCarObjects.getCargoRailwayCars();
        assertThat(20, equalTo(listOf20CargoRailwayCars.size()));
    }

    @Test
    public void test_getLocomotives() {

        assertThrows(RuntimeException.class, RailwayCarObjects::getLocomotives);

    }



    @Test
    public void test_getTickets() {

        final List<Ticket> listOf20Tickets = TicketObjects.getTickets();
        assertThat(20, equalTo(listOf20Tickets.size()));
    }



    @Test
    public void test_getUsers() {

        final List<User > listOf100Users = UserObjects.getUsers();
        assertThat(100, equalTo(listOf100Users.size()));
    }

    @Test
    public void test_getTrainDrivers() {

        assertThrows(RuntimeException.class, UserObjects::getTrainDrivers);

    }



    @Test
    public void test_getTrain() {

        assertThrows(RuntimeException.class, TrainObjects::getTrain);

    }
}
