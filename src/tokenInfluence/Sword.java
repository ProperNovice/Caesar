package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class Sword extends TokenInfluenceNormal {

	public Sword(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.SWORD;
	}

}
