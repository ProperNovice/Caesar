package listCredentials;

import managers.Credentials;
import utils.Enums.DirectionEnum;

public class ListPlayerBottom extends ListCredentials {

	public ListPlayerBottom() {

		super.coordinatesList = Credentials.INSTANCE.cControlTokensBottomPlayer;
		super.gapBetweenComponents = Credentials.INSTANCE.dGapBetweenControlMarkers;
		super.objectsPerRow = 2;
		super.directionEnumHorizontal = DirectionEnum.LEFT;
		super.directionEnumVertical = DirectionEnum.UP;

	}

}
