
public class BasketballTeam {

	String pointGuard;
	String powerForward;
	String shootingGuard;
	String smallForward;
	String center;
	
	// constructor with no user-selected players
	BasketballTeam()
	{
		pointGuard = "Anthony Andrews";
		powerForward = "Bryan Brown";
		shootingGuard = "Chris Crown";
		smallForward = "David Daniels";
		center = "Evan Evans";
	}
	
	// constructor with one user-selected player
	BasketballTeam(String chosenPointGuard)
	{
		pointGuard = chosenPointGuard;
		powerForward = "Bryan Brown";
		shootingGuard = "Chris Crown";
		smallForward = "David Daniels";
		center = "Evan Evans";
	}
	
	// constructor with two user-selected players
	BasketballTeam(String chosenPointGuard, String chosenPowerForward)
	{
		pointGuard = chosenPointGuard;
		powerForward = chosenPowerForward;
		shootingGuard = "Chris Crown";
		smallForward = "David Daniels";
		center = "Evan Evans";
	}
	
	// constructor with three user-selected players
	BasketballTeam(String chosenPointGuard, String chosenPowerForward, String chosenShootingGuard)
	{
		pointGuard = chosenPointGuard;
		powerForward = chosenPowerForward;
		shootingGuard = chosenShootingGuard;
		smallForward = "David Daniels";
		center = "Evan Evans";
	}
	
	// constructor with four user-selected players
	BasketballTeam(String chosenPointGuard, String chosenPowerForward, String chosenShootingGuard, String chosenSmallForward)
	{
		pointGuard = chosenPointGuard;
		powerForward = chosenPowerForward;
		shootingGuard = chosenShootingGuard;
		smallForward = chosenSmallForward;
		center = "Evan Evans";
	}
	
	// constructor with five user-selected players
	BasketballTeam(String chosenPointGuard, String chosenPowerForward, String chosenShootingGuard, String chosenSmallForward, String chosenCenter)
	{
		pointGuard = chosenPointGuard;
		powerForward = chosenPowerForward;
		shootingGuard = chosenShootingGuard;
		smallForward = chosenSmallForward;
		center = chosenCenter;
	}

}
