package com.blz.gambling_simulator;

public class GamblingSimulator {
	
	static int stake = 100;
	static int Bet = 1;
	public static void main (String[] Args) {
		System.out.println("Weclome To Gambling Simulator");
		int stake = 100;
		int bet =1;
		double Betting = Math.floor(Math.random() * 100) % 2;
		if ( Betting == bet ) {
			stake ++;
			System.out.println("Gambler is Winning $1");
			System.out.println("stake= " + stake);
		}
		else {
			stake --;
			System.out.println("Gambler is loseing $1");
			
		}
		}
	}
	
			
	

	


