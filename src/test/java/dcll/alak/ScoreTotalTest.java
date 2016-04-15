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
        //cas 1 :
        for (int i = 0; i < 12; i++) {
            myScore.add(new Frame(10, 0));
        }
        assertEquals(scoreTotal.calculerScore(myScore), 300);

        myScore.clear();

        //cas 2 :
        for (int i = 0; i < 10; i++) {
            myScore.add(new Frame(9, 0));
        }
        assertEquals(scoreTotal.calculerScore(myScore), 90);
        myScore.clear();

        //cas 3 :
        for (int i = 0; i < 11; i++) {
            myScore.add(new Frame(5, 5));
        }
        assertEquals(scoreTotal.calculerScore(myScore), 150);
        myScore.clear();

        for (int i = 0; i < 10; i++) {
            myScore.add(new Frame(5, 0));
        }
        assertEquals(scoreTotal.calculerScore(myScore), 50);
        myScore.clear();
        myScore.add(new Frame(9, 0));
        myScore.add(new Frame(9, 1));
        myScore.add(new Frame(8, 2));
        myScore.add(new Frame(9, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(7, 0));
        myScore.add(new Frame(9, 0));
        myScore.add(new Frame(10, 0));
        myScore.add(new Frame(6, 4));
        myScore.add(new Frame(3, 0));
        myScore.add(new Frame(0, 0));
        myScore.add(new Frame(0, 0));

        assertEquals(scoreTotal.calculerScore(myScore), 124);
}


}