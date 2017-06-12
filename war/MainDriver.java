package war;

import java.util.Scanner;

public class MainDriver {

	/**
	 * @param args
	 */
	 public static void main(String[] args){
		    Scanner scanner = new Scanner(System.in);
		    System.out.print("1) War!\n2) Peace! \nChoose a game:");
		    int game = scanner.nextInt();
		    if(game == 1){
	             playGame(new Deck());
		    }
		    else{
		    	playGame(new PeaceDeck());
		    }
	    }

	    public static void playGame(Deck deck){
	        Hand[] hands = deck.split();
	        Cards card1, card2;
	        int player1Wins = 0, player2Wins = 0, round = 1;

	        while(!hands[0].isEmpty()) {
	            System.out.println("Round " + round + "!\n------------------");
	            card1 = hands[0].draw();
	            card2 = hands[1].draw();

	            System.out.println("Player 1 draws: " + card1);
	            System.out.println("Player 2 draws: " + card2);

	            if (card1.isWinner(card2)) {
	                System.out.println("Player 1 wins the round!\n");
	                ++player1Wins;
	            }
	            else {
	                System.out.println("Player 2 wins the round!\n");
	                ++player2Wins;
	            }
	            ++round;
	        }

	        System.out.println("Final Score\n------------------");
	        System.out.println("Player 1: " + player1Wins);
	        System.out.println("Player 2: " + player2Wins);

	        if (player1Wins > player2Wins) {
	            System.out.println("Player 1 wins the game!");
	        }
	        else if (player2Wins > player1Wins) {
	            System.out.println("Player 2 wins the game!");
	        }
	        else {
	            System.out.println("The game is a draw!");
	        }

	    }

	}
