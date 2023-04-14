package listCredentials;

import managers.Credentials;

public class ListPlayerTop extends ListCredentials {

	public ListPlayerTop() {

		super.coordinatesList = Credentials.INSTANCE.cControlTokensTopPlayer;
		super.gapBetweenComponents = Credentials.INSTANCE.dGapBetweenControlMarkers;
		super.objectsPerRow = 2;

	}

}
