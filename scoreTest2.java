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
    ScoreSheet testScoreSheet();
    testScoreSheet.roll(7);
    testScoreSheet.roll(2);
    assertEquals(testScoreSheet.score(1), 9);
    assertEquals(testScoreSheet.score(), 9);
  }

  @Test
  public void testStrikeMovesToNextFrame(){

  }

  @Test
  public void testStrikeOnLastFrame(){

  }
}
