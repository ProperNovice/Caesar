package listCredentials;

import managers.Credentials;
import utils.Enums.DirectionEnum;
import utils.Enums.RelocateTypeEnum;

public class ListControlMarkerPlayerBottom extends ListCredentials {

	public ListControlMarkerPlayerBottom() {

		super.coordinatesList = Credentials.INSTANCE.cControlTokensBottomPlayer;
		super.gapBetweenComponents = Credentials.INSTANCE.dGapBetweenControlMarkers;
		super.objectsPerRow = 2;
		super.directionEnumHorizontal = DirectionEnum.LEFT;
		super.directionEnumVertical = DirectionEnum.UP;
		super.relocateTypeEnum = RelocateTypeEnum.CENTER;

	}

}
