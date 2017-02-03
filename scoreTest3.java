import static org.junit.Assert.*;

import org.junit.Test;

public class scoreTest3 {
	
	ScoreSheet s = new ScoreSheet();

	@Test
	public void testThreeThrows(){
		s.roll(1);
		s.roll(2);
		s.roll(3);
		
		assertEquals(s.score(), 6);
		assertEquals(s.getScoreAt(1), 3);
		assertEquals(s.getScoreAt(2), 3);
	}
	
	@Test
	public void testStrikeCountsNextFrameScores(){
		s.roll(10);
		s.roll(10);
		s.roll(10);
	
		assertEquals(s.getScoreAt(1), 30);
	}
	
	@Test (expected = Exception.class)
	public void testThrowOn11thFrame(){
		for (int i = 0; i < 11; ++i) {
			s.roll(10);
		}
	}

}
