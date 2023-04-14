package provinces;

import managers.Credentials;
import managers.TokenProvinceManager;
import tokenProvinces.TokenProvince;
import utils.ArrayList;
import utils.Vector2;

public abstract class Province {

	private ArrayList<Vector2> listCoordinatesCenterTokens = new ArrayList<>();
	private ArrayList<TokenProvince> listTokenProvinceBonus = new ArrayList<>();

	public Province() {

		addTokenProvinceCoordinates(getCoordinatesCenterPrimary());
		addTokenProvinceCoordinates(getCoordinatesCenterSecondary());

	}

	public void setUpTokenProvinceBonus() {

		TokenProvince tokenProvinceBonus = null;

		// set up primary token

		tokenProvinceBonus = getPrimaryToken();

		tokenProvinceBonus.getImageView()
				.relocateCenter(this.listCoordinatesCenterTokens.getFirst());
		tokenProvinceBonus.getImageView().setVisible(true);
		this.listTokenProvinceBonus.addLast(tokenProvinceBonus);

		// set up secondary token

		tokenProvinceBonus = getSecondaryToken();

		if (tokenProvinceBonus == null)
			return;

		tokenProvinceBonus.getImageView()
				.relocateCenter(this.listCoordinatesCenterTokens.getLast());
		tokenProvinceBonus.getImageView().setVisible(true);
		this.listTokenProvinceBonus.addLast(tokenProvinceBonus);

	}

	private void addTokenProvinceCoordinates(Vector2 vector2) {

		if (vector2 == null)
			return;

		vector2 = vector2.addVector2(Credentials.INSTANCE.cMap.clone());

		this.listCoordinatesCenterTokens.addLast(vector2);

	}

	protected abstract Vector2 getCoordinatesCenterPrimary();

	protected TokenProvince getPrimaryToken() {
		return TokenProvinceManager.INSTANCE.getRandomToken();
	}

	protected TokenProvince getSecondaryToken() {
		return null;
	}

	protected Vector2 getCoordinatesCenterSecondary() {
		return null;
	}

}
