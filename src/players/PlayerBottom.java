package players;

import listCredentials.ListCredentials;
import listCredentials.ListControlMarkerPlayerBottom;

public class PlayerBottom extends Player {

	@Override
	public Class<? extends ListCredentials> getControlMarkerListCredentials() {
		return ListControlMarkerPlayerBottom.class;
	}

}
