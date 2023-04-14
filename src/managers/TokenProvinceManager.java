package managers;

import java.lang.reflect.InvocationTargetException;

import tokenProvinces.Centurion;
import tokenProvinces.Might;
import tokenProvinces.Poison;
import tokenProvinces.Senate;
import tokenProvinces.Tactics;
import tokenProvinces.TokenProvince;
import tokenProvinces.Wealth;
import utils.ArrayList;

public enum TokenProvinceManager {

	INSTANCE;

	private ArrayList<TokenProvince> list = new ArrayList<>();

	private TokenProvinceManager() {
		createTokens();
	}

	public TokenProvince getRandomToken() {
		return this.list.removeRandom();
	}

	public TokenProvince getSpecificToken(Class<? extends TokenProvince> classToken) {

		TokenProvince tokenProvinceBonus = null;

		for (TokenProvince tokenProvinceBonusTemp : this.list)
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

	private void addTokens(Class<? extends TokenProvince> classToken, int amount) {

		for (int counter = 1; counter <= amount; counter++) {

			TokenProvince tokenProvinceBonus = null;

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
