package tokenProvincesBonus;

import enums.ELayerZ;
import utils.ImageView;

public abstract class TokenProvinceBonus {

	public TokenProvinceBonus() {

		String fileName = "";
		fileName += "province/";
		fileName += this.getClass().getSimpleName();
		fileName += ".png";

		new ImageView(fileName, ELayerZ.TOKENS, this);

	}

}
