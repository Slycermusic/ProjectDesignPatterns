
public class Main {
	public static void main(String args[]) {
		PlayerModel playerModel = new PlayerModel(6, 8, 4);
		PlayerController playerController = new PlayerController(playerModel);
		playerController.displayViews();
	}
}
