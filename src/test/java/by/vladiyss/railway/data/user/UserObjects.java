package by.vladiyss.railway.data.user;

import by.vladiyss.railway.domain.user.TrainDriver;
import by.vladiyss.railway.domain.user.User;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UserObjects {

    public static List<User> getUsers() {
        final List<User> listOf100Users = IntStream.range(0, 100)
                .mapToObj(i -> new User(UUID.randomUUID(),
                        "firstname #" + i,
                        "lastname #" + i,
                        i + 15,
                        i % 2 == 0))
                .collect(Collectors.toList());
        return listOf100Users;
    }

    public static List<TrainDriver> getTrainDrivers() {
        final List<TrainDriver> listOf5TrainDrivers = IntStream.range(0, 5)
                .mapToObj(i -> new TrainDriver(UUID.randomUUID(),
                        "firstname #" + i,
                        "lastname #" + i,
                        i + 15,
                        i % 2 == 0,
                        UUID.randomUUID()))
                .collect(Collectors.toList());
        return listOf5TrainDrivers;
    }
}
