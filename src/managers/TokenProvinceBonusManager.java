package managers;

import java.lang.reflect.InvocationTargetException;

import tokenProvincesBonus.Centurion;
import tokenProvincesBonus.Might;
import tokenProvincesBonus.Poison;
import tokenProvincesBonus.Senate;
import tokenProvincesBonus.Tactics;
import tokenProvincesBonus.TokenProvinceBonus;
import tokenProvincesBonus.Wealth;
import utils.ArrayList;

public enum TokenProvinceBonusManager {

	INSTANCE;

	private ArrayList<TokenProvinceBonus> list = new ArrayList<>();

	private TokenProvinceBonusManager() {
		createTokens();
	}

	public TokenProvinceBonus getRandomToken() {
		return this.list.removeRandom();
	}

	public TokenProvinceBonus getSpecificToken(Class<? extends TokenProvinceBonus> classToken) {

		TokenProvinceBonus tokenProvinceBonus = null;

		for (TokenProvinceBonus tokenProvinceBonusTemp : this.list)
			if (tokenProvinceBonusTemp.getClass().equals(classToken)) {

				tokenProvinceBonus = tokenProvinceBonusTemp;
				break;

			}

		this.list.remove(tokenProvinceBonus);

		return tokenProvinceBonus;

	}

	private void createTokens() {

		addTokens(Senate.class, 6);
		addTokens(Might.class, 4);
		addTokens(Tactics.class, 4);
		addTokens(Wealth.class, 4);
		addTokens(Poison.class, 3);
		addTokens(Centurion.class, 3);

		this.list.saveOriginal();

	}

	private void addTokens(Class<? extends TokenProvinceBonus> classToken, int amount) {

		for (int counter = 1; counter <= amount; counter++) {

			TokenProvinceBonus tokenProvinceBonus = null;

			try {
				tokenProvinceBonus = classToken.getConstructor().newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}

			this.list.addLast(tokenProvinceBonus);

		}

	}

}
