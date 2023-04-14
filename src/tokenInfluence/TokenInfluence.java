package tokenInfluence;

import enums.EColor;
import enums.EInfluenceTokenType;
import enums.ELayerZ;
import managers.Credentials;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class TokenInfluence implements IImageViewAble {

	private int topValue, bottomValue;

	public TokenInfluence(EColor eColor, int topValue, int bottomValue) {

		this.topValue = topValue;
		this.bottomValue = bottomValue;

		createToken(eColor);

	}

	protected abstract EInfluenceTokenType getInfluenceTokenType();

	private void createToken(EColor eColor) {

		String filePath = "";
		filePath += "influence/";
		filePath += eColor.toString().toLowerCase();
		filePath += "/";
		filePath += getInfluenceTokenType().toString().toLowerCase();
		filePath += "/";
		filePath += this.topValue;
		filePath += this.bottomValue;
		filePath += ".png";

		new ImageView(filePath, ELayerZ.TOKENS, this);
		getImageView().setWidth(Credentials.INSTANCE.dToken);

	}

	public int getTopValue() {
		return this.topValue;
	}

	public int getBottomValue() {
		return this.bottomValue;
	}

}
