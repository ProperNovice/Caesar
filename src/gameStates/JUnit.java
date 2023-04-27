package gameStates;

import borders.Border;
import enums.EColor;
import gameStatesDefault.GameState;
import managers.BorderManager;
import managers.ControlMarkerManager;
import managers.ProvinceManager;
import managers.TokenInfluenceManager;
import tokenInfluence.TokenInfluence;
import utils.ArrayList;
import utils.Lock;

public class JUnit extends GameState {

	private double rotate = 0;

	@Override
	public void execute() {

		ProvinceManager.INSTANCE.setUpStartingTokenProvince();
		ControlMarkerManager.INSTANCE.setUpControlMarkers();
		BorderManager.values();

		testBorders();

	}

	public void testBorders() {

		for (Border border : BorderManager.INSTANCE.getList()) {

			TokenInfluence tokenInfluence = TokenInfluenceManager.INSTANCE
					.removeRandomTokenNormal(new ArrayList<EColor>(EColor.values()).getRandom());
			tokenInfluence.getImageView().setVisible(true);

			border.addTokenProvinceAnimateSynchronous(tokenInfluence);

		}

		Lock.INSTANCE.lock();

	}

	@Override
	protected void handleTokenInfluencePressedInBorder(TokenInfluence tokenInfluence) {

		this.rotate += 20;
		tokenInfluence.getImageView().setRotate(this.rotate);

		System.out.println(this.rotate);

	}

}
