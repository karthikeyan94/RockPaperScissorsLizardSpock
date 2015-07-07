import java.util.*;

class RockPaperScissorsLizardSpock {
	
	int name_to_number(String name) {
		
		if(name == "rock")
			return 0;
		else if(name == "Spock")
			return 1;
		else if(name == "paper")
			return 2;
		else if(name == "lizard")
			return 3;
		else if(name == "scissors")
			return 4;
		else {
			System.out.println("Error, in name input");
			return -1;
		}
	}
	
	String number_to_name(int num) {
		
		if(num == 0)
			return "rock";
		else if(num == 1)
			return "Spock";
		else if(num == 2)
			return "paper";
		else if(num == 3)
			return "lizard";
		else if(num == 4)
			return "scissors";
		else {
			System.out.println("Error, in num input");
			return "";
		}
	}

	void rpsls(String guess) {
		
		Random r = new Random();
		int player_number = name_to_number(guess);
		int comp_number = r.nextInt(5);
		
		System.out.println("Player chooses " + number_to_name(player_number));
		System.out.println("Computer chooses " + number_to_name(comp_number));
		
		if(((player_number - comp_number) % 5) == 0)
			System.out.println("Player and computer tie!\n");
		
		else if(((player_number - comp_number) % 5) <= 2) 
			System.out.println("Player wins!\n");
			
		else 
			System.out.println("Computer wins!\n");
		
	}
	
	public static void main(String ar[]) {
		
		RockPaperScissorsLizardSpock RPSLS = new RockPaperScissorsLizardSpock();
		RPSLS.rpsls("rock");
		RPSLS.rpsls("Spock");
		RPSLS.rpsls("paper");
		RPSLS.rpsls("lizard");
		RPSLS.rpsls("scissors");
	}
}
