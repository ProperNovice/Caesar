package gameStates;

import gameStatesDefault.GameState;
import managers.ProvinceManager;

public class JUnit extends GameState {

	@Override
	public void execute() {

		ProvinceManager.INSTANCE.setUpStartingTokenProvinceBonus();

	}

}
