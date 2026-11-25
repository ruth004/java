import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike(false, 3, 300);
    }

    @Test
    public void bikeIsOff() {
        assertFalse(bike.getState());
    }

    @Test
    public void turnOnBike() {
        bike.turnOn();

        assertTrue(bike.getState());
    }

    @Test
    public void turnOffBike() {
        bike.turnOn();
        bike.turnOff();

        assertFalse(bike.getState());
    }

    @Test
    public void accelerateBike() {
        bike.turnOn();
        bike.accelerate();

        assertEquals(1, bike.getCurrentSpeed());
    }

    @Test
    public void decelerateBike() {
        bike.turnOn();

        bike.accelerate();
        bike.accelerate();

        bike.decelerate();

        assertEquals(1, bike.getCurrentSpeed());
    }

    @Test
    public void GearTwo() {
        bike.turnOn();

        for (int index = 1; index <= 20; index++) {
            bike.accelerate();
        }

        assertEquals(1, bike.getGear());
    }

    @Test
    public void GearThree() {
        bike.turnOn();

        for (int index = 1; index <= 26; index++) {
            bike.accelerate();
        }

        assertEquals(3, bike.getGear());
    }

    @Test
    public void GearFour() {
        bike.turnOn();

        for (int index = 1; index <= 30; index++) {
            bike.accelerate();
        }

        assertEquals(4, bike.getGear());
    }

    @Test
    public void speedNegative() {
        bike.turnOn();
        bike.decelerate();

        assertEquals(0, bike.getCurrentSpeed());
    }

    @Test
    public void bikeAccelerateWhenOff() {
        bike.accelerate();

        assertEquals(1, bike.getCurrentSpeed());
    }
}



