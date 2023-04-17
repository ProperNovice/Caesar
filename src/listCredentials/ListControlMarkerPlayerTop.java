package listCredentials;

import managers.Credentials;
import utils.Enums.RelocateTypeEnum;

public class ListControlMarkerPlayerTop extends ListCredentials {

	public ListControlMarkerPlayerTop() {

		super.coordinatesList = Credentials.INSTANCE.cControlTokensTopPlayer;
		super.gapBetweenComponents = Credentials.INSTANCE.dGapBetweenControlMarkers;
		super.objectsPerRow = 2;
		super.relocateTypeEnum = RelocateTypeEnum.CENTER;

	}

}
