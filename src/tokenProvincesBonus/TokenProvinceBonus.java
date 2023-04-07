package tokenProvincesBonus;

import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class TokenProvinceBonus implements IImageViewAble {

	public TokenProvinceBonus() {

		String fileName = "";
		fileName += "province/";
		fileName += this.getClass().getSimpleName();
		fileName += ".png";

		new ImageView(fileName, ELayerZ.TOKENS, this);
		getImageView().setVisible(false);

	}

}
