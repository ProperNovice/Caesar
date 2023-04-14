package managers;

import business.Map;

public enum InstantiateComponents {

	INSTANCE;

	private InstantiateComponents() {

		Map.values();
		TokenProvinceManager.values();

	}

}
