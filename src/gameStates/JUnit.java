package gameStates;

import enums.EColor;
import gameStatesDefault.GameState;
import managers.ProvinceManager;
import tokenInfluence.Centurion;
import tokenInfluence.Shield;
import tokenInfluence.Ship;

public class JUnit extends GameState {

	@Override
	public void execute() {

		ProvinceManager.INSTANCE.setUpStartingTokenProvinceBonus();
		new Centurion(EColor.BLUE, 4, 4, Shield.class, Ship.class);

	}

}
