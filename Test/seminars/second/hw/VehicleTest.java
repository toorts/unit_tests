package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class VehicleTest {
    // Проверить, что экземпляр объекта Car также является экземпляром
    // транспортного средства (используя оператор instanceof)
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Tesla", "Model X", 2017);
        assertTrue(car instanceof Vehicle);
    }

    // Проверить, что объект Car создается с 4-мя колесами
    @Test
    public void testCarIsFourWheels() {
        Car car = new Car("Tesla", "Model X", 2017);
        assertTrue(car.getNumWheels() == 4);
    }

    // Проверить, что объект Motorcycle создается с 2-мя колесами
    @Test
    public void testMotoIsTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Aprilia", "Pegaso", 2008);
        assertTrue(motorcycle.getNumWheels() == 2);
    }

    // Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive())
    @Test
    public void testCarIsSpeedTest() {
        Car car = new Car("Toyota", "Corolla", 2015);
        car.testDrive();
        assertTrue(car.getSpeed() == 60);
    }

    // Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive())
    @Test
    public void testMotoIsSpeedTest() {
        Motorcycle motorcycle = new Motorcycle("Aprilia", "Pegaso", 2008);
        motorcycle.testDrive();
        assertTrue(motorcycle.getSpeed() == 75);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // машина останавливается (speed = 0)
    @Test
    public void testCarIsStopAfterParking() {
        Car car = new Car("Tesla", "Model X", 2017);
        car.testDrive();
        car.park();
        assertTrue(car.getSpeed() == 0);
    }

    // Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта)
    // мотоцикл останавливается (speed = 0)
    @Test
    public void testMotoIsStopAfterParking() {
        Motorcycle motorcycle = new Motorcycle("Aprilia", "Pegaso", 2008);
        motorcycle.testDrive();
        motorcycle.park();
        assertTrue(motorcycle.getSpeed() == 0);
    }
}