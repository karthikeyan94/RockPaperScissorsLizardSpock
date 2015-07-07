import java.util.Random;
import java.util.Scanner;
import java.util.HashMap;

class RockPSLS_hashmap {
	
	static public HashMap<String, Integer> key = new HashMap<String, Integer>();
	static public int[][] answer = {
								{ 0, 1, -1, -1, 1 },
								{ -1, 0, 1, -1, 1 },
								{ 1, -1, 0, -1, 1 },
								{ 1, -1, 1, 0, -1 },
								{ -1, -1, 1, 1, 0 }
							};
	static public String[] inputs = { "Rock", "Paper", "Scissor", "Lizard", "Spock" };
	
	static {
		
		key.put("rock", 0);
		key.put("paper", 1);
		key.put("scissor", 2);
		key.put("lizard", 3);
		key.put("spock", 4);
	}
	
	public static void main(String args[]) {
		
		int ans;
		int user;		
		int computer;
		boolean nextgame = true;
		Random r = new Random();
		Scanner terminal = new Scanner(System.in);
		
		while(nextgame) {
			try {
				computer = r.nextInt(5);
				System.out.print("Player chooses : ");
				user = key.get(terminal.nextLine().toLowerCase());
				
				ans = answer[user][computer];		
				System.out.println(String.format("Computer chooses %s\n%s", inputs[computer], ans == 0 ? "Draw" : ans == 1 ? "Computer Wins" : "Player Wins"));
				
				System.out.print("\nWanna play again? (Y/N) : ");
				nextgame = (terminal.nextLine().equals("Y") ? true : false);
			}
			
			catch(Exception e) {
				System.out.println("Give a proper input numbnut!");
			}
		}
	}
}
