package by.vladiyss.railway.domain.user;

import by.vladiyss.railway.Runner;

import java.util.UUID;

public class TrainDriver extends User{

    private final UUID licenseId;

    public UUID getLicenseId() {
        return licenseId;
    }

    public TrainDriver(UUID id, String firstname, String lastname, int age, boolean isMale, UUID licenseId) {
        super(id, firstname, lastname, isMale);
        validateUserAge(age);
        this.licenseId = licenseId;
        Runner.logger.debug("Created --- " + this.toString());
    }

    public TrainDriver(TrainDriver trainDriver) {
        super(trainDriver.getId(), trainDriver.getFirstname(), trainDriver.getLastname(),
                trainDriver.getAge(), trainDriver.isMale());
        this.licenseId = trainDriver.getLicenseId();
        Runner.logger.debug("Created --- " + this.toString());
    }

    private boolean validateUserAge(int age) {
        if (age > 18) {
            return true;
        }
        else {
            Runner.logger.error("Invalid train driver age! " + age);
            throw new RuntimeException("Invalid train driver age!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "TrainDriver: " + "licenseId=" + licenseId + '.';
    }
}
