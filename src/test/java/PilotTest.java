import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Jim", RankType.FIRST_OFFICER, "GB202021");
    }

    @Test
    public void getRankType() {
        assertEquals(RankType.FIRST_OFFICER, pilot.getRankType());
    }

    @Test
    public void setRankType() {
        pilot.setRankType(RankType.CAPTAIN);
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }

    @Test
    public void getLicenseNumber() {
        assertEquals("GB202021", pilot.getLicenseNumber());
    }

    @Test
    public void setLicenseNumber() {
        pilot.setLicenseNumber("GB203021");
        assertEquals("GB203021", pilot.getLicenseNumber());
    }

    @Test
    public void canFly(){
        pilot.flyPlane();
        assertEquals("I'm flying the plane", pilot.flyPlane());
    }
}