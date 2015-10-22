package roulette;

import roulette.bets.OddEven;
import roulette.bets.RedBlack;
import roulette.bets.ThreeConsecutive;
import util.ConsoleReader;

public class BetFactory {

	public BetFactory() {}
	
	public static Bet placeBet(int betNum){
		String result = "";
		Bet b = null;
        switch (betNum) {
            case 1:	result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
            		b = new RedBlack("Red or Black", 1);
                    break;
            case 2:	result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
            		b =  new OddEven("Odd or Even", 1);
            		break;
            case 3:	 result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                    1, Wheel.NUM_SPOTS - 3);
            		b = new ThreeConsecutive("Three in a Row", 11);
            		break;
        }
        
        System.out.println();
        return b;
	}

}
