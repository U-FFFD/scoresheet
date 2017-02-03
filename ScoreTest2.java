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
  public void testCurrentFrame(){
    ScoreSheet testScoreSheet = new ScoreSheet();
    for (int i = 1; i <= 10; i++){
      assertEquals(testScoreSheet.getCurrFrame(), i);
      testScoreSheet.roll(5);
      testScoreSheet.roll(2);
    }
  }

  @Test
  public void testTwoThrows(){
    ScoreSheet testScoreSheet = new ScoreSheet();
    testScoreSheet.roll(7);
    testScoreSheet.roll(2);
    assertEquals(testScoreSheet.getScoreAt(1), 9);
    assertEquals(testScoreSheet.score(), 9);
  }


  @Test
  public void testStrikeMovesToNextFrame(){
    ScoreSheet testScoreSheet = new ScoreSheet();
    assertEquals(testScoreSheet.getCurrFrame(), 1);
    testScoreSheet.roll(10);
    assertEquals(testScoreSheet.getCurrFrame(), 2);
  }


  @Test
  public void testStrikeOnLastFrame(){
    ScoreSheet testScoreSheet = new ScoreSheet();
    for (int i = 0; i < 7; i++)
    {
      testScoreSheet.roll(2);
      testScoreSheet.roll(3);
    }
    assertEquals(testScoreSheet.score(), 35);
    testScoreSheet.roll(10);
    assertEquals(testScoreSheet.score(), 45);
    testScoreSheet.roll(10);
    assertEquals(testScoreSheet.score(), 65);
    testScoreSheet.roll(10);
    assertEquals(testScoreSheet.score(), 95);
  }
}
