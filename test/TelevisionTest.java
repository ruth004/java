import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    public Television television;

    @BeforeEach
    public void setUp() {
        television = new Television();
        television.turnOn();
    }

    @Test
    public void testTurnOn() {
        assertTrue(television.getPowerStatus());
    }


    @Test
    public void testTurnOff() {
        television.turnOff();

        assertFalse(television.getPowerStatus());
    }


    @Test
    public void testIncreaseVolume() {
        television.increaseVolume();

        assertEquals(1, television.getVolume());
    }


    @Test
    public void testDecreaseVolume() {
        television.increaseVolume();
        television.decreaseVolume();

        assertEquals(0, television.getVolume());
    }

    @Test
    public void testChangeChannel() {
        television.changeChannel(5);

        assertEquals(5, television.getChannel());
    }


    @Test
    public void testIncreaseBrightness() {
        television.increaseBrightness();

        assertEquals(51, television.getBrightness());
    }

    @Test
    public void testDecreaseBrightness() {
        television.decreaseBrightness();

        assertEquals(49, television.getBrightness());
    }

    @Test
    public void testMute() {
        television.mute();

        assertTrue(television.getMuteStatus());
    }

    @Test
    public void testUnmute() {
        television.mute();
        television.unmute();

        assertFalse(television.getMuteStatus());
    }

}
