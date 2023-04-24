package borders;

import provinces.Province;
import tokenInfluence.TokenInfluence;
import utils.Vector2;

public class BorderBuilder {

	private Vector2 coordinatesCenter = null;
	private double rotateOriginal = -1;
	private Class<? extends Province> classProvinceTop, classProvinceBottom;
	private Class<? extends TokenInfluence> classTokenInfluence = null;

	public BorderBuilder() {

	}

	public BorderBuilder coordinatesCenter(double x, double y) {
		this.coordinatesCenter = new Vector2(x, y);
		return this;
	}

	public BorderBuilder rotateOriginal(double rotateOriginal) {
		this.rotateOriginal = rotateOriginal;
		return this;
	}

	public BorderBuilder classProvinces(Class<? extends Province> classProvinceTop,
			Class<? extends Province> classProvinceBottom) {
		this.classProvinceTop = classProvinceTop;
		this.classProvinceBottom = classProvinceBottom;
		return this;
	}

	public BorderBuilder classTokenInfluence(Class<? extends TokenInfluence> classTokenInfluence) {
		this.classTokenInfluence = classTokenInfluence;
		return this;
	}

	public Border build() {
		return new Border(this.classTokenInfluence, this.classProvinceTop, this.classProvinceBottom,
				this.coordinatesCenter, this.rotateOriginal);
	}

}
