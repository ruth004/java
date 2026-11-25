package GoePoliticalZone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class GeoPoliticalZoneTest {

        @Test
        public void testGetZoneForLagos() {
            GoePoliticalZoneEnum result = GeoPoliticalZone.getZone("Lagos");

            assertEquals(GoePoliticalZoneEnum.SOUTH_WEST, result);
        }

        @Test
        public void testGetZoneForAbuja() {
            GoePoliticalZoneEnum result = GeoPoliticalZone.getZone("Abuja");

            assertEquals(GoePoliticalZoneEnum.NORTH_CENTRAL, result);
        }

        @Test
        public void testGetZoneForRivers() {
            GoePoliticalZoneEnum result = GeoPoliticalZone.getZone("Rivers");

            assertEquals(GoePoliticalZoneEnum.SOUTH_SOUTH, result);
        }

        @Test
        public void testGetZoneWithLowerCase() {
            GoePoliticalZoneEnum result = GeoPoliticalZone.getZone("lagos");

            assertEquals(GoePoliticalZoneEnum.SOUTH_WEST, result);
        }

        @Test
        public void testInvalidState() {
            GoePoliticalZoneEnum result = GeoPoliticalZone.getZone("London");

            assertNull(result);
        }
    }

