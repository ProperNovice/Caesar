package provinces;

import managers.Credentials;
import utils.Vector2;

public abstract class Province {

	private Vector2 coordinatesCenterPrimary = null;

	public Province() {

		double pixelsToAdd = Credentials.INSTANCE.dToken / 2;
		this.coordinatesCenterPrimary = getCoordinatesTopLeftPrimary().addX(pixelsToAdd).addY(pixelsToAdd);

	}

	protected abstract Vector2 getCoordinatesTopLeftPrimary();

}
