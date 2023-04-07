package managers;

import provinces.Province;

public enum Model {

	INSTANCE;

	public void setUpStartingTokenProvinceBonus() {

		for (Province province : ProvinceManager.INSTANCE.getProvinces())
			province.setUpTokenProvinceBonus();

	}

}
