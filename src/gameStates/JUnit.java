package gameStates;

import gameStatesDefault.GameState;
import managers.Model;

public class JUnit extends GameState {

	@Override
	public void execute() {

		Model.INSTANCE.setUpStartingTokenProvinceBonus();

	}

}
