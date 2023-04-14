package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class TokenInfluenceSword extends TokenInfluenceNormal {

	public TokenInfluenceSword(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.SWORD;
	}

}
