package provinces;

import managers.TokenProvinceBonusManager;
import tokenProvincesBonus.Senate;
import tokenProvincesBonus.TokenProvinceBonus;
import utils.Vector2;

public class Italia extends Province {

	@Override
	protected Vector2 getCoordinatesTopLeftPrimary() {
		return new Vector2(532, 602);
	}

	@Override
	protected Vector2 getCoordinatesTopLeftSecondary() {
		return new Vector2(596, 552);
	}

	@Override
	protected TokenProvinceBonus getSecondaryToken() {
		return TokenProvinceBonusManager.INSTANCE.getSpecificToken(Senate.class);
	}

}
