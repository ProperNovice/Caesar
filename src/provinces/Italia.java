package provinces;

import managers.TokenProvinceManager;
import tokenProvinces.Senate;
import tokenProvinces.TokenProvince;
import utils.Vector2;

public class Italia extends Province {

	@Override
	protected Vector2 getCoordinatesCenterPrimary() {
		return new Vector2(569, 639);
	}

	@Override
	protected Vector2 getCoordinatesCenterSecondary() {
		return new Vector2(632, 589);
	}

	@Override
	protected TokenProvince getSecondaryToken() {
		return TokenProvinceManager.INSTANCE.getSpecificToken(Senate.class);
	}

}
