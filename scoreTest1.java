/* Kody Fitch CS 361
 *  Lab 1 JUnit Bowling Tests*/

import static org.junit.Assert.*;
import org.junit.Test;

public class ScoreTest1
{
	
	@Test
	public void testOneThrow(){
		ScoreSheet sheet = new ScoreSheet();
		sheet.roll(4);
		assertEquals(sheet.score(), 4);
		assertEquals(sheet.getScoreAt(1), 4);
		
		sheet.roll(10);
		assertEquals(sheet.getScoreAt(1), 4); // Make sure score isn't changed
		
	}
	
	@Test
	public void testSpareCountsNextFrameScore(){
		ScoreSheet sheet = new ScoreSheet();
		sheet.roll(6);
		sheet.roll(4);
		sheet.roll(10);
		assertEquals(sheet.getScoreAt(1), 20);
		
		sheet.roll(10);
		assertEquals(sheet.getScoreAt(1), 20); //Make sure score still doesn't change
	}
	
	@Test
	public void testSpareOnLastFrame(){
		ScoreSheet sheet = new ScoreSheet();
		
		 for (int i = 0; i < 8; i++)
		    {
		     sheet.roll(0);
		     sheet.roll(1);
		    }
		 assertEquals(sheet.score(), 8);
		 
		 sheet.roll(6);
		 sheet.roll(4);
		 assertEquals(sheet.score(), 18);
		 
		 sheet.roll(6);
		 sheet.roll(4);
		 assertEquals(sheet.score(), 38);
		
	}
	
	
	
	
	
}
