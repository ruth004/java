import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Mp3Test {
    
    private Mp3  player;

    @BeforeEach
    public void setUp() {
        player = new Mp3();
        player.addSong("don wizzy");

    }

    @Test
    public void testMusicPlayerIsNotPlayingInitially() {
        assertFalse(player.getIsPlaying());
    }

    @Test
    public void testPlayMusic() {
        player.play();

        assertTrue(player.getIsPlaying());
    }


    @Test
    public void testPauseMusic() {
        player.play();
        player.pause();

        assertFalse(player.getIsPlaying());
    }


    @Test
    public void testStopMusic() {
        player.play();
        player.stop();

        assertFalse(player.getIsPlaying());
    }

    @Test
    public void testNextSong() {
        player.addSong("essence");
        player.nextSong();

        assertEquals("essence", player.getCurrentSong());
    }

    @Test
    public void testPreviousSong() {
        player.getPreviousSong();

        assertEquals("don wizzy", player.getCurrentSong());
    }

    @Test
    public void testIncreaseVolume() {
        player.increaseVolume();

        assertEquals(51, player.getVolume());
    }

    @Test
    public void testDecreaseVolume() {
        player.decreaseVolume();

        assertEquals(49, player.getVolume());
    }

    @Test
    public void testVolumeCannotGoAbove100() {

        for (int index = 0; index < 60; index++) {
            player.increaseVolume();
        }

        assertEquals(100, player.getVolume());
    }

    @Test
    public void testVolumeCannotGoBelowZero() {

        for (int index = 0; index < 60; index++) {
            player.decreaseVolume();
        }

        assertEquals(0, player.getVolume());
    }


}