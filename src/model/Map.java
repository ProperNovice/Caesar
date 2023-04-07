package model;

import enums.ELayerZ;
import managers.Credentials;
import utils.ImageView;
import utils.Interfaces.IImageViewAble;
import utils.Interfaces.IMouseEventAble;

public enum Map implements IImageViewAble, IMouseEventAble {

	INSTANCE;

	private Map() {

		new ImageView("map.png", ELayerZ.MAP, this);
		getImageView().relocateTopLeft(Credentials.INSTANCE.cMap);

	}

}
