package by.vladiyss.railway.domain.railwayCar;

import by.vladiyss.railway.Runner;
import by.vladiyss.railway.domain.user.TrainDriver;
import by.vladiyss.railway.domain.user.User;

import java.util.UUID;

public class Locomotive extends RailwayCar {

    private TrainDriver driver;

    public User getDriver() {
        return new TrainDriver(driver);
    }

    public void setDriver(TrainDriver driver) {
        this.driver = driver;
    }

    public Locomotive(UUID id, String vin, RailwayCarBrand brand, TrainDriver driver) {
        super(id, vin, brand);
        this.driver = driver;
        Runner.logger.debug("Created --- " + this.toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Locomotive: " + "driver=" + driver + '.';
    }
}
