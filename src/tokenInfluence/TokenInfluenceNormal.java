package tokenInfluence;

import enums.EColor;

public abstract class TokenInfluenceNormal extends TokenInfluence {

	public TokenInfluenceNormal(EColor eColor, int topValue, int bottomValue) {

		super(eColor, topValue, bottomValue);
		super.iconTypes.addLast(this.getClass());

	}

}
