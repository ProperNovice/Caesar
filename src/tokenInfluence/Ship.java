package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class Ship extends TokenInfluenceNormal {

	public Ship(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.SHIP;
	}

}
