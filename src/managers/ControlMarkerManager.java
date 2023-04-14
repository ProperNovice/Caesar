package managers;

import controlMarkers.ControlMarker;
import enums.EColor;
import utils.ArrayList;
import utils.HashMap;

public enum ControlMarkerManager {

	INSTANCE;

	private HashMap<EColor, ArrayList<ControlMarker>> list = new HashMap<>();

	private ControlMarkerManager() {
		createControlMarkers();
	}

	private void createControlMarkers() {

		for (EColor eColor : EColor.values()) {

			ArrayList<ControlMarker> list = new ArrayList<>();
			this.list.put(eColor, list);

			for (int counter = 1; counter <= 12; counter++)
				list.addLast(new ControlMarker(eColor));

			list.saveOriginal();

		}

	}

}
