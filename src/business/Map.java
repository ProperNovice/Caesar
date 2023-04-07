package business;

import enums.ELayerZ;
import managers.Credentials;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Interfaces.IMouseEventAble;

public enum Map implements IImageViewAble, IMouseEventAble {

	INSTANCE;

	private Map() {

		createMap();

	}

	private void createMap() {
		new ImageView("map.png", ELayerZ.MAP, this);
		getImageView().relocateTopLeft(Credentials.INSTANCE.cMap);
	}

}
