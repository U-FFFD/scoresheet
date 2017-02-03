// Collaborators : Emmett Wesolowski
import java.lang.Math;

public class ScoreSheet {
	  private int rolls[] = new int[21];
	  private int currentRoll = 0;

	  public void roll(int pins) {
	    rolls[currentRoll++] = pins;
	  }

	  public int score() {
	    int score = 0;
	    int frameIndex = 0;
	    for (int frame = 0; frame < 10; frame++) {
	      if (isStrike(frameIndex)) {
	        score += 10 + strikeBonus(frameIndex);
	        frameIndex++;
	      } else if (isSpare(frameIndex)) {
	        score += 10 + spareBonus(frameIndex);
	        frameIndex += 2;
	      } else {
	        score += sumOfPinsInFrame(frameIndex);
	        frameIndex += 2;
	      }
	    }
	    return score;
	  }

	  public int getScoreAt(int frame) {
		int score = 0;
		int frameIndex = 0;
		for (int i = 0; i < frame ; i++) {
			if(isStrike(frameIndex)) {
				score += strikeBonus(frameIndex);
				frameIndex++;
			} else if (isSpare(frameIndex)) {
				score += 10 + spareBonus(frameIndex);
				frameIndex += 2;
			} else {
				score += sumOfPinsInFrame(frameIndex);
				frameIndex += 2;
			}
		}

		if (frame != 1 ) {
			score = getScoreAt(frame-1);
		}

		return score;
	}

	public int getCurrFrame() {
		  int current;

      if (currentRoll % 2 == 1){
        current = (currentRoll + 1) / 2;
      } else {
        current = currentRoll / 2;
      }

		  return ++current;
	  }

	  private boolean isStrike(int frameIndex) {
	    return rolls[frameIndex] == 10;
	  }

	  private int sumOfPinsInFrame(int frameIndex) {
	    return rolls[frameIndex] + rolls[frameIndex+1];
	  }

	  private int spareBonus(int frameIndex) {
	    return rolls[frameIndex+2];
	  }

	  private int strikeBonus(int frameIndex) {
	    return rolls[frameIndex+1] + rolls[frameIndex+2];
	  }

	  private boolean isSpare(int frameIndex) {
	    return rolls[frameIndex]+rolls[frameIndex+1] == 10;
	  }
	  public class BowlingException extends RuntimeException {
		  BowlingException(String message) {
			  super(message);
		  }
	  }
}
