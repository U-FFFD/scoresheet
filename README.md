# scoresheet
Bowling scoresheet with JUnit tests

### Running JUnit Tests from the Command Line
**note:** Ensure that junit-4.12.jar and hamcrest-core-1.3.jar are in the project directory.

Compile the three unit tests and the suite:
```
javac -cp .:junit-4.12.jar ScoreTest1.java
javac -cp .:junit-4.12.jar ScoreTest2.java
javac -cp .:junit-4.12.jar ScoreTest3.java
javac -cp .:junit-4.12.jar TestSuite.java
```
Run the test:
```
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestSuite
```
