package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class TokenInfluenceLaurel extends TokenInfluenceNormal {

	public TokenInfluenceLaurel(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.LAUREL;
	}

}
