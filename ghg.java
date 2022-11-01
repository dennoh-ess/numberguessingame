package Swing;

import java.util.Random;
import java.util.Scanner;

public class GHG {
	public static void main(String[] args) {
		Random Dancan = new Random();
		Scanner Oiseni = new Scanner(System.in);
		int NumToGuess = Oiseni.nextInt();
		int randomNumber = Dancan.nextInt(100);
		System.out.println(randomNumber);
		Game game = new Game(NumToGuess, randomNumber);
		game.addToHistory(NumToGuess);
		String matched = game.validateGuessedNumber(randomNumber, NumToGuess);
		System.out.println(matched);
	}
}
