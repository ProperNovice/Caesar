package managers;

import utils.Enums.RearrangeTypeEnum;
import utils.Vector2;

public enum Credentials {

	INSTANCE;

	public final String primaryStageTitle = "Caesar", numbersImageViewColor = "black";
	public final boolean colliderVisibility = true;
	public final double gapBetweenBorders = 25, textHeight = 50,
			selectEventHandlerAbleDimension = 100, animationStep = 4;
	public Vector2 dFrame, dGapBetweenComponents, dGapBetweenComponentsLineCast;
	public Vector2 cTextPanel, cImageViewIndicator;
	public RearrangeTypeEnum rearrangeTypeEnumText = RearrangeTypeEnum.LINEAR;

	public Vector2 cMap, cControlTokensTopPlayer, cControlTokensBottomPlayer;
	public Vector2 dGapBetweenControlMarkers;
	public double dToken;

	private Credentials() {

		double x = 0, y = 0;

		this.dFrame = new Vector2(1920, 1368);
		this.dGapBetweenComponents = new Vector2(4, 4);
		this.dGapBetweenComponentsLineCast = this.dGapBetweenComponents;

		// c text panel

		this.cTextPanel = new Vector2(x, y);

		// c image view indicator

		x = this.gapBetweenBorders;
		y = this.gapBetweenBorders;
		this.cImageViewIndicator = new Vector2(x, y);

		// c map

		x = this.gapBetweenBorders;
		this.cMap = new Vector2(x, x);

		// d token

		this.dToken = 76;

		// c control token top player

		x = this.cMap.x;
		x += 84;
		y = this.cMap.y;
		y += 82;
		this.cControlTokensTopPlayer = new Vector2(x, y);

		// c control token bottom player

		x = this.cMap.x;
		x += 911;
		y = this.cMap.y;
		y += 1233;
		this.cControlTokensBottomPlayer = new Vector2(x, y);

		// c gap between control markers

		x = 78;
		y = 78;
		this.dGapBetweenControlMarkers = new Vector2(x, y);

	}

}
