package borders;

import managers.Credentials;
import provinces.Province;
import tokenInfluence.TokenInfluence;
import utils.Animation;
import utils.Enums.AnimationSynchEnum;
import utils.Interfaces.ISelectCoordinatesAble;
import utils.Vector2;

public class Border implements ISelectCoordinatesAble {

	private Vector2 coordinatesCenter = null;
	private double rotateOriginal = -1;
	private Class<? extends Province> classProvinceTop, classProvinceBottom;
	private Class<? extends TokenInfluence> classTokenInfluence = null;
	private TokenInfluence tokenInfluence = null;

	public Border(Class<? extends TokenInfluence> classTokenInfluence,
			Class<? extends Province> classProvinceTop,
			Class<? extends Province> classProvinceBottom, Vector2 coordinatesCenter,
			double rotateOriginal) {

		this.classTokenInfluence = classTokenInfluence;
		this.classProvinceTop = classProvinceTop;
		this.classProvinceBottom = classProvinceBottom;
		this.rotateOriginal = rotateOriginal;
		this.coordinatesCenter = coordinatesCenter;
		this.coordinatesCenter = this.coordinatesCenter.addVector2(Credentials.INSTANCE.cMap);

	}

	public boolean containsTokenInfluence(TokenInfluence tokenInfluence) {

		if (this.tokenInfluence == null)
			return false;
		else
			return this.tokenInfluence.equals(tokenInfluence);

	}

	public void addTokenProvinceAnimateSynchronous(TokenInfluence tokeninfluence) {

		this.tokenInfluence = tokeninfluence;
		this.tokenInfluence.getImageView().setRotate(this.rotateOriginal);
		Animation.INSTANCE.animateCenter(this.tokenInfluence, this.coordinatesCenter,
				AnimationSynchEnum.SYNCHRONOUS);

	}

	@Override
	public Vector2 getSelectCoordinatesCenter() {
		return this.coordinatesCenter;
	}

}
