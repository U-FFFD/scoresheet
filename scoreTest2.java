/* Owen Monsma
   CS361
*/

/* Tests:
  * testTwoThrows
  * testStrikeMovesToNextFrame
  * testStrikeOnLastFrame
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class ScoreTest2 {
  @Test
  public void testTwoThrows(){
    ScoreSheet testScoreSheet = new ScoreSheet();
    testScoreSheet.roll(7);
    testScoreSheet.roll(2);
    assertEquals(testScoreSheet.score(1), 9);
    assertEquals(testScoreSheet.score(), 9);
  }

  @Test
  public void testStrikeMovesToNextFrame(){
    ScoreSheet testScoreSheet = new ScoreSheet();
    int beforeStrikeFrame = testScoreSheet.getCurrFrame();
    testScoreSheet.roll(10);
    assertEquals(beforeStrikeFrame, testScoreSheet.getCurrFrame());
  }

  @Test
  public void testStrikeOnLastFrame(){
    ScoreSheet testScoreSheet = new ScoreSheet();
    for (int i = 0; i < 7; i++)
    {
      testScoreSheet.roll(2);
      testScoreSheet.roll(3);
    }
    testScoreSheet.roll(10);
    testScoreSheet.roll(10);
    testScoreSheet.roll(10);
  }
}
