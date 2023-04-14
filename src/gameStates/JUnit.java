package gameStates;

import enums.EColor;
import gameStatesDefault.GameState;
import managers.ProvinceManager;
import tokenInfluence.Shield;

public class JUnit extends GameState {

	@Override
	public void execute() {

		ProvinceManager.INSTANCE.setUpStartingTokenProvinceBonus();

		new Shield(EColor.BLUE, 2, 4);

	}

}
