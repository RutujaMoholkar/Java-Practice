/*
 Create a class game,which allows the user to play guess the number game. game should have following methods 
		1.constructor to generate the random number
		2.takeUserinput() to take user input of number
		3.isCorrectNumber() to detect whether the number entered by the user is true
		4.getter and setter for noOfGuesses
		use properties such as noOfGuesses(int) to get this task done.
		*/



package com.practice;
import java.util.Random;
import java.util.Scanner;

class Game
{
	public int number;
	public int inputNumber;
	private int noOfGuesses=0;
	Game()
	{
		Random rand =new Random();
		number=rand.nextInt(100);// 0 to 100

	}
	void takeUserInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the number : ");
		inputNumber=sc.nextInt();
	}
	boolean isCorrectNumber()
	{
		noOfGuesses++;
		if(inputNumber==number)
		{
			System.out.format("Yes!! you guessed it right.It was %d\n You guessed it in %d attempts.",number,noOfGuesses);
			return true;
		}
		else if(inputNumber<number)
		{
			System.out.println("too low ..");
		}
		else if(inputNumber>number)
		{
			System.out.println("too high ..");
		}
		return false;
		
		
	}
}

public class GuessNumber {

	public static void main(String[] args)
	{
		Game g=new Game();
		boolean b=false;
		while(!b)
		{
		g.takeUserInput();
	    b= g.isCorrectNumber();
		
		}

	}

}
