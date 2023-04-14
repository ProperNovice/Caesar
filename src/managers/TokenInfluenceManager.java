package managers;

import enums.EColor;
import tokenInfluence.Centurion;
import tokenInfluence.Laurel;
import tokenInfluence.Shield;
import tokenInfluence.Ship;
import tokenInfluence.Sword;
import tokenInfluence.TokenInfluenceNormal;
import utils.ArrayList;
import utils.HashMap;

public enum TokenInfluenceManager {

	INSTANCE;

	private HashMap<EColor, ArrayList<TokenInfluenceNormal>> tokenInfluenceNormal = new HashMap<>();
	private HashMap<EColor, ArrayList<Centurion>> tokenInfluenceCenturion = new HashMap<>();

	private TokenInfluenceManager() {

		createInfluenceTokensNormal();
		createInfluenceTokensCenturion();

	}

	private void createInfluenceTokensNormal() {

		for (EColor eColor : EColor.values()) {

			ArrayList<TokenInfluenceNormal> list = new ArrayList<>();
			this.tokenInfluenceNormal.put(eColor, list);

			list.addLast(new Laurel(eColor, 0, 4));
			list.addLast(new Laurel(eColor, 1, 3));
			list.addLast(new Laurel(eColor, 2, 2));
			list.addLast(new Laurel(eColor, 2, 2));

			list.addLast(new Shield(eColor, 0, 6));
			list.addLast(new Shield(eColor, 1, 5));
			list.addLast(new Shield(eColor, 2, 4));
			list.addLast(new Shield(eColor, 3, 3));

			list.addLast(new Ship(eColor, 0, 6));
			list.addLast(new Ship(eColor, 1, 5));
			list.addLast(new Ship(eColor, 2, 4));
			list.addLast(new Ship(eColor, 3, 3));

			list.addLast(new Sword(eColor, 0, 6));
			list.addLast(new Sword(eColor, 1, 5));
			list.addLast(new Sword(eColor, 2, 4));
			list.addLast(new Sword(eColor, 3, 3));

		}

	}

	private void createInfluenceTokensCenturion() {

		for (EColor eColor : EColor.values()) {

			ArrayList<Centurion> list = new ArrayList<>();
			this.tokenInfluenceCenturion.put(eColor, list);

			list.addLast(new Centurion(eColor, 0, 7, Sword.class));
			list.addLast(new Centurion(eColor, 4, 4, Ship.class, Shield.class));
			list.addLast(new Centurion(eColor, 3, 3, Laurel.class));

		}

	}

}
