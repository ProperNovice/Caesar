package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class TokenInfluenceShield extends TokenInfluenceNormal {

	public TokenInfluenceShield(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.SHIELD;
	}

}
