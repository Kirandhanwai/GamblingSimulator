package com.blz.gambling_simulator;

public class GamblingSimulator {
	
	static int STAKE_PER_DAY = 100;
	static int BET_PER_GAME = 1;
	public static void main (String[] Args) {
		System.out.println("Weclome To Gambling Simulator");
		{
		int stake = 100;
		int bet =1;
	
		double Betting = Math.floor(Math.random() * 100) % 2;
		
		if ( Betting == bet ) {
			stake ++;
			System.out.println("Gambler is Winning");	
		}
		
		else {
			stake --;
			System.out.println("Gambler is Loseing");
			
		}
		}
	}
}
	
			
	

	


