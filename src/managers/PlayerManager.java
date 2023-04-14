package managers;

import players.Player;
import players.PlayerBottom;
import players.PlayerTop;

public enum PlayerManager {

	INSTANCE;

	private Player playerTop = null, playerBottom = null;

	private PlayerManager() {

		this.playerTop = new PlayerTop();
		this.playerBottom = new PlayerBottom();

	}

}
