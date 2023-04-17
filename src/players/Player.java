package players;

import controlMarkers.ControlMarker;
import listCredentials.ListCredentials;
import utils.ArrayList;
import utils.ListImageViewAbles;

public abstract class Player {

	private ListImageViewAbles<ControlMarker> listControlMarker = null;

	public Player() {

		this.listControlMarker = new ListImageViewAbles<>(getControlMarkerListCredentials());

	}

	public final void addControlMarkersAndRelocate(ArrayList<ControlMarker> list) {

		this.listControlMarker.getArrayList().addAllLast(list);
		this.listControlMarker.relocateImageViews();

	}

	protected abstract Class<? extends ListCredentials> getControlMarkerListCredentials();

}
