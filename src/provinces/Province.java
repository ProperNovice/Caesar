package provinces;

import managers.Credentials;
import managers.TokenProvinceBonusManager;
import tokenProvincesBonus.TokenProvinceBonus;
import utils.ArrayList;
import utils.Vector2;

public abstract class Province {

	private ArrayList<Vector2> listCoordinatesCenterTokens = new ArrayList<>();
	private ArrayList<TokenProvinceBonus> listTokenProvinceBonus = new ArrayList<>();

	public Province() {

		addTokenProvinceCoordinates(getCoordinatesTopLeftPrimary());
		addTokenProvinceCoordinates(getCoordinatesTopLeftSecondary());

	}

	public void setUpTokenProvinceBonus() {

		TokenProvinceBonus tokenProvinceBonus = null;

		// set up primary token

		tokenProvinceBonus = getPrimaryToken();

		tokenProvinceBonus.getImageView()
				.relocateCenter(this.listCoordinatesCenterTokens.getFirst());
		tokenProvinceBonus.getImageView().setVisible(true);
		this.listTokenProvinceBonus.addLast(tokenProvinceBonus);

		// set up secondary token

		if (getSecondaryToken() == null)
			return;

		tokenProvinceBonus = getSecondaryToken();

		tokenProvinceBonus.getImageView()
				.relocateCenter(this.listCoordinatesCenterTokens.getLast());
		tokenProvinceBonus.getImageView().setVisible(true);
		this.listTokenProvinceBonus.addLast(tokenProvinceBonus);

	}

	private void addTokenProvinceCoordinates(Vector2 vector2) {

		if (vector2 == null)
			return;

		vector2 = vector2.addVector2(Credentials.INSTANCE.cMap.clone());

		double pixelsToAdd = Credentials.INSTANCE.dToken / 2;
		vector2 = vector2.addX(pixelsToAdd).addY(pixelsToAdd);

		this.listCoordinatesCenterTokens.addLast(vector2);

	}

	protected abstract Vector2 getCoordinatesTopLeftPrimary();

	protected TokenProvinceBonus getPrimaryToken() {
		return TokenProvinceBonusManager.INSTANCE.getRandomToken();
	}

	protected TokenProvinceBonus getSecondaryToken() {
		return null;
	}

	protected Vector2 getCoordinatesTopLeftSecondary() {
		return null;
	}

}
