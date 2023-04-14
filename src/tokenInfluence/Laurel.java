package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;

public class Laurel extends TokenInfluenceNormal {

	public Laurel(EColor eColor, int topValue, int bottomValue) {
		super(eColor, topValue, bottomValue);
	}

	@Override
	protected EInfluenceTokenType getInfluenceTokenType() {
		return EInfluenceTokenType.LAUREL;
	}

}
