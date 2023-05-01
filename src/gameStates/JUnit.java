package gameStates;

import borders.Border;
import gameStatesDefault.GameState;
import managers.BorderManager;
import managers.ControlMarkerManager;
import managers.ProvinceManager;
import tokenInfluence.Ship;
import tokenInfluence.TokenInfluence;
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

			if (border.getClassTokenInfluence().equals(Ship.class))
				border.setSelected();

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
