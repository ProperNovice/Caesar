package tokenInfluence;

import enums.EColor;
import enums.ELayerZ;
import managers.Credentials;
import utils.ArrayList;
import utils.Flow;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public abstract class TokenInfluence implements IImageViewAble {

	private int topValue, bottomValue;
	protected ArrayList<Class<? extends TokenInfluence>> iconTypes = new ArrayList<>();

	public TokenInfluence(EColor eColor, int topValue, int bottomValue) {

		this.topValue = topValue;
		this.bottomValue = bottomValue;

		createToken(eColor);

	}

	@Override
	public void handleMousePressedPrimary() {
		Flow.INSTANCE.getGameStateCurrent().handleTokenInfluencePressed(this);
	}

	private void createToken(EColor eColor) {

		String filePath = "";
		filePath += "influence/";
		filePath += eColor.toString().toLowerCase();
		filePath += "/";
		filePath += this.getClass().getSimpleName().toLowerCase();
		filePath += "/";
		filePath += this.topValue;
		filePath += this.bottomValue;
		filePath += ".png";

		new ImageView(filePath, ELayerZ.TOKENS, this);
		getImageView().setWidth(Credentials.INSTANCE.dToken);
		getImageView().setVisible(false);

	}

	public int getTopValue() {
		return this.topValue;
	}

	public int getBottomValue() {
		return this.bottomValue;
	}

}
