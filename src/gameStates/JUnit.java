package gameStates;

import enums.EColor;
import gameStatesDefault.GameState;
import managers.ProvinceManager;
import tokenInfluence.TokenInfluenceShield;

public class JUnit extends GameState {

	@Override
	public void execute() {

		ProvinceManager.INSTANCE.setUpStartingTokenProvinceBonus();

		new TokenInfluenceShield(EColor.BLUE, 2, 4);

	}

}
