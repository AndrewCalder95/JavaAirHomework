import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("James", RankType.CAPTAIN);
    }

    @Test
    public void getName() {
        assertEquals("James", cabinCrewMember.getName());
    }

    @Test
    public void setName() {
        cabinCrewMember.setName("Frank");
        assertEquals("Frank", cabinCrewMember.getName());
    }

    @Test
    public void getRankType() {
        assertEquals(RankType.CAPTAIN, cabinCrewMember.getRankType());
    }

    @Test
    public void setRankType() {
        cabinCrewMember.setRankType(RankType.FIRST_OFFICER);
        assertEquals(RankType.FIRST_OFFICER, cabinCrewMember.getRankType());

    }
}