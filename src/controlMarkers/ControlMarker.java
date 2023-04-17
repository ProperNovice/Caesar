package controlMarkers;

import enums.EColor;
import enums.ELayerZ;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;

public class ControlMarker implements IImageViewAble {

	public ControlMarker(EColor eColor) {

		String fileName = "";
		fileName += "influence/";
		fileName += eColor.toString().toLowerCase();
		fileName += "/";

		new ImageView(fileName + "control marker.png", ELayerZ.TOKENS, this);
		getImageView().setBack(fileName + "back.png");

	}

}
