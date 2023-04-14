package players;

import listCredentials.ListCredentials;
import listCredentials.ListPlayerTop;

public class PlayerTop extends Player {

	@Override
	public Class<? extends ListCredentials> getListCredentials() {
		return ListPlayerTop.class;
	}

}
