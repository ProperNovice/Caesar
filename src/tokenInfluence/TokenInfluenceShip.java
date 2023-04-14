package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class TokenInfluenceShip extends TokenInfluenceNormal {

	public TokenInfluenceShip(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.SHIP;
	}

}
