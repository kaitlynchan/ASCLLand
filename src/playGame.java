import java.util.Arrays;
import java.util.Scanner;

public class playGame {
	
	ASCLLand playerA = new ASCLLand (0);
	ASCLLand playerB = new ASCLLand (0);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i <= 5; i++){
			System.out.println(playGame.round(i));
		}

	}
	
	public int movePosition (int roll){
		playerA.getPosition();
		System.out.println(playerA.getPosition());
		//4 or 6
		//other player at same position
		return roll;
	}

	public String round (int i){
		System.out.print("Line #" + i + ": ");
		Scanner userInput = new Scanner (System.in);
		String diceRolls [] = (userInput.nextLine()).split(",");
		int rollsArray [] = new int [diceRolls.length];
		
		for (int index = 0; index < rollsArray.length; index++){
			rollsArray[index] = Integer.parseInt(diceRolls[index]);	
		}
		
		System.out.println(Arrays.toString(rollsArray));
	
		for (int m = 0; m < rollsArray.length-1; m++){
			if (m % 2 == 0){
				playerA.setPosition(movePosition(rollsArray[m]));
				//set position, based on movePosition
				//playerA.setPosition(movePosition)
			}
			else {
				//set position, based on movePosition
				//playerB.setPosition(movePosition)
			}
		}
		
		return "A: , B:";
		//get position for object A and B
		//System.out.println(playerA.getPosition())
		//System.out.println(playerB.getPosition())
	}

}
