package Swing;

import java.util.ArrayList;

public class Game {
private int guessNumber;
private int randomNumber;
private ArrayList<Integer> guessedNumbers = new ArrayList<Integer>();

public Game(int guessNumber, int randomNumber) {
	super();
	this.guessNumber = guessNumber;
	this.randomNumber = randomNumber;
}
public int getRandomNumber() {
	return randomNumber;
}
public void setRandomNumber(int randomNumber) {
	this.randomNumber = randomNumber;
}
public int getGuessNumber() {
	return guessNumber;
}
public void setGuessNumber(int guessNumber) {
	this.guessNumber = guessNumber;
}
public ArrayList<Integer> getGuessedNumbers() {
	return guessedNumbers;
}
public void setGuessedNumbers(ArrayList<Integer> guessedNumbers) {
	this.guessedNumbers = guessedNumbers;

}

public String validateGuessedNumber(int randomNumber, int guessedNumber) {
	String validMatch="";
    if (guessedNumber == randomNumber) {
        validMatch="correct";
    }
    else if (guessedNumber < randomNumber) {
     validMatch="below";
    }
    else if (guessedNumber > randomNumber) {
       validMatch="above";
    }
    return validMatch;
}

public ArrayList<Integer> addToHistory(int guessedNumber) {
	guessedNumbers.add(guessedNumber);
	return guessedNumbers;
}

public void resetHistory() {
	guessedNumbers.clear();
}

}
