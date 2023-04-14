package tokenInfluence;

import enums.EColor;

public class Centurion extends TokenInfluence {

	@SafeVarargs
	public Centurion(EColor eColor, int topValue, int bottomValue,
			Class<? extends TokenInfluence>... classTypes) {

		super(eColor, topValue, bottomValue);
		super.iconTypes.addAllLast(classTypes);

	}

}
