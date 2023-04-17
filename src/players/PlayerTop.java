package players;

import listCredentials.ListCredentials;
import listCredentials.ListControlMarkerPlayerTop;

public class PlayerTop extends Player {

	@Override
	public Class<? extends ListCredentials> getControlMarkerListCredentials() {
		return ListControlMarkerPlayerTop.class;
	}

}
