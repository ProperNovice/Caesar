package tokenProvincesBonus;

import enums.ELayerZ;
import managers.Credentials;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class TokenProvince implements IImageViewAble {

	public TokenProvince() {

		String fileName = "";
		fileName += "province/";
		fileName += this.getClass().getSimpleName();
		fileName += ".png";

		new ImageView(fileName, ELayerZ.TOKENS, this);
		getImageView().setWidth(Credentials.INSTANCE.dToken);
		getImageView().setVisible(false);

	}

}
