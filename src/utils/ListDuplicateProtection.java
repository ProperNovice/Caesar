package utils;

import managers.ListsManager;
import utils.Interfaces.IImageViewAble;

public enum ListDuplicateProtection {

	INSTANCE;

	private ArrayList<ArrayList<IImageViewAble>> lists = new ArrayList<>();

	private ListDuplicateProtection() {

	}

	public void addList(ArrayList<IImageViewAble> list) {
		this.lists.addLast(list);
	}

	public void execute(ListImageViewAbles<IImageViewAble> list, IImageViewAble object) {

		for (ListImageViewAbles<IImageViewAble> objectList : ListsManager.INSTANCE.lists) {

			if (objectList.equals(list)) {

				boolean found = false;

				for (IImageViewAble imageViewAble : list.getArrayList()) {

					if (!imageViewAble.equals(object))
						continue;

					if (found)
						ShutDown.INSTANCE.execute();

					found = true;

				}

			} else if (objectList.getArrayList().contains(object))
				ShutDown.INSTANCE.execute();

		}

	}

}
