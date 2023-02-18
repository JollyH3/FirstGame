import java.util.Scanner;

import components.Game;
import components.Player;

public class main{
    
    public static void main(String[] args) throws InterruptedException {
    
        Player player = new Player();
        Game game;

        boolean end = false;
        String menu = "1)New Game\n"
                    + "2)Load Game\n"
                    + "3)Stats\n"
                    + "4)Info\n"
                    + "5)EXIT";

        while(!end) {
            System.out.println(menu);
            int index = checkInput(1, 5);
            switch (index) {
                case 1:
                    game = newGame();
                    break;

                case 2:
                    
                    break;

                case 3:
                    
                    break;

                case 4:
                    System.out.println("This game was created by Jolly & Bepi");
                    Thread.sleep(1500);
                    break;

                case 5:
                    System.out.println("Bye Bye!");
                    end = true;
                    break;

                default:

                    break;
            }
        }
    }

    public static Game newGame(){
        String gameName;
        String playerName;
        Scanner scan = new Scanner(System.in);
        System.out.print("\n************\nNEW GAME\n************\n\nNew Gamw name:");
        gameName = scan.nextLine();
        System.out.print("Player name: ");
        playerName = scan.nextLine();
        Player player = new Player(playerName, (float) Math.random()*110, (float) Math.random()*110);
        Game game = new Game(gameName, player, null, 0, 0);
        return game;
    }
    public static void Game(){
        Scanner scan = new Scanner(System.in);
        boolean end = false;
        while(!end) {
            
        }
    }

    public static int checkInput(int min, int max) {
		
		Scanner scan = new Scanner(System.in);
		boolean ok = false;
		int input = 0;
		while(!ok) {
			try {
				input = scan.nextInt();
				if( input >= min && input <= max) {
					ok = true;
				} else {
					System.out.println("Scegliere un numero compreso fra " + min + " e " + max);
				}

			} catch (Exception e) {
				System.out.println("Scegliere un numero compreso fra " + min + " e " + max);
				scan.nextLine();
			}
		}
		return input;

	}
}