package dcll.alak;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by PC SALON on 15/04/2016.
 */
public class ScoreTotalTest {

    private ScoreTotal scoreTotal;

    @Before
    public void setUp() throws Exception {
        scoreTotal = new ScoreTotal();
        System.out.println("Test");

    }

    @Test
    public void testCalculerScore() throws Exception {

        ArrayList<Frame> myScore = new ArrayList<Frame>();

        for (int i = 0; i < 12; i++) {
            myScore.add(new Frame(10, 0));
        }
        assertEquals(scoreTotal.calculerScore(myScore), 300);
    }
}