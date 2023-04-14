package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class Shield extends TokenInfluenceNormal {

	public Shield(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.SHIELD;
	}

}
