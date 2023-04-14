package players;

import listCredentials.ListCredentials;
import listCredentials.ListPlayerBottom;

public class PlayerBottom extends Player {

	@Override
	public Class<? extends ListCredentials> getListCredentials() {
		return ListPlayerBottom.class;
	}

}
