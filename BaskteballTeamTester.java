import java.util.Scanner;

public class BaskteballTeamTester {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String selectedPointGuard = null;
		String selectedPowerForward = null;
		String selectedShootingGuard = null;
		String selectedSmallForward = null;
		String selectedCenter = null;
		
		System.out.println("You will put together an ideal combination of five basketball starters based off of how many people you can pick and are assigned to you.");
		System.out.println("Who do you chose to be your point guard?");
		selectedPointGuard = input.nextLine();
		System.out.println("Who do you chose to be your power forward?");
		selectedPowerForward = input.nextLine();
		System.out.println("Who do you chose to be your shooting guard?");
		selectedShootingGuard = input.nextLine();
		System.out.println("Who do you chose to be your small forward?");
		selectedSmallForward = input.nextLine();
		System.out.println("Who do you chose to be your center?");
		selectedCenter = input.nextLine();
		
		BasketballTeam teamZeroChoices = new BasketballTeam();
		BasketballTeam teamOneChoice = new BasketballTeam(selectedPointGuard);
		BasketballTeam teamTwoChoices = new BasketballTeam(selectedPointGuard, selectedPowerForward);
		BasketballTeam teamThreeChoices = new BasketballTeam(selectedPointGuard, selectedPowerForward, selectedShootingGuard);
		BasketballTeam teamFourChoices = new BasketballTeam(selectedPointGuard, selectedPowerForward, selectedShootingGuard, selectedSmallForward);
		BasketballTeam teamFiveChoices = new BasketballTeam(selectedPointGuard, selectedPowerForward, selectedShootingGuard, selectedSmallForward, selectedCenter);
		
		System.out.println("If you are assigned all five players, your point guard is " + teamZeroChoices.pointGuard + ", your power forward is " + teamZeroChoices.powerForward + 
				", your shooting guard is " + teamZeroChoices.shootingGuard + ", your small forward is " + teamZeroChoices.smallForward + ", and your center is " + teamZeroChoices.center);
		System.out.println("If you can pick your point guard, your point guard is " + teamOneChoice.pointGuard + ", your power forward is " + teamOneChoice.powerForward + 
				", your shooting guard is " + teamOneChoice.shootingGuard + ", your small forward is " + teamOneChoice.smallForward + ", and your center is " + teamOneChoice.center);
		System.out.println("If you can pick your point guard and power forward, your point guard is " + teamTwoChoices.pointGuard + ", your power forward is " + teamTwoChoices.powerForward + 
				", your shooting guard is " + teamTwoChoices.shootingGuard + ", your small forward is " + teamTwoChoices.smallForward + ", and your center is " + teamTwoChoices.center);
		System.out.println("If you can pick your point guard, power forward, and shooting guard, your point guard is " + teamThreeChoices.pointGuard + ", your power forward is " + teamThreeChoices.powerForward + 
				", your shooting guard is " + teamThreeChoices.shootingGuard + ", your small forward is " + teamThreeChoices.smallForward + ", and your center is " + teamThreeChoices.center);
		System.out.println("If you can pick your point guard, power forward, shooting guard, and small forward, your point guard is " + teamFourChoices.pointGuard + ", your power forward is " + teamFourChoices.powerForward + 
				", your shooting guard is " + teamFourChoices.shootingGuard + ", your small forward is " + teamFourChoices.smallForward + ", and your center is " + teamFourChoices.center);
		System.out.println("If you can pick all five players, your point guard is " + teamFiveChoices.pointGuard + ", your power forward is " + teamFiveChoices.powerForward + 
				", your shooting guard is " + teamFiveChoices.shootingGuard + ", your small forward is " + teamFiveChoices.smallForward + ", and your center is " + teamFiveChoices.center);
	}
}