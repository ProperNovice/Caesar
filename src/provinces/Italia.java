package provinces;

import managers.TokenProvinceBonusManager;
import tokenProvincesBonus.Senate;
import tokenProvincesBonus.TokenProvinceBonus;
import utils.Vector2;

public class Italia extends Province {

	@Override
	protected Vector2 getCoordinatesTopLeftPrimary() {
		return new Vector2(569, 639);
	}

	@Override
	protected Vector2 getCoordinatesTopLeftSecondary() {
		return new Vector2(635, 589);
	}

	@Override
	protected TokenProvinceBonus getSecondaryToken() {
		return TokenProvinceBonusManager.INSTANCE.getSpecificToken(Senate.class);
	}

}
