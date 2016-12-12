import java.util.Scanner;

public class playGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ASCLLand playerA = new ASCLLand();
		ASCLLand playerB = new ASCLLand();
		
		for (int i = 1; i <= 5; i++){
			System.out.println(playGame.round(i));
		}
		System.out.println();
		Scanner in = new Scanner(System.in);
		String statement = in.nextLine();

	}
	


	public static String round (int i){
		System.out.println("Line #" + i + ": ");
		Scanner userInput = new Scanner (System.in);
		String diceRolls = userInput.nextLine();
		String rollsArray [] = diceRolls.split(",");
	
		//for player A
		for (int j = 0; j < rollsArray.length-2; k += 2){
			
		}
		
		//for player B
		for (int k = 1; k < rollsArray.length-1; k += 2){
			
		}
		return "A: , B:";
	}

}
