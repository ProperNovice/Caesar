package managers;

import borders.Border;
import borders.BorderBuilder;
import provinces.Achaia;
import provinces.Dalmatia;
import provinces.Gallia;
import provinces.GalliaCisalpina;
import provinces.HispaniaCiterior;
import provinces.HispaniaUlterior;
import provinces.Macedonia;
import provinces.Mauritania;
import tokenInfluence.Shield;
import tokenInfluence.Ship;
import tokenInfluence.Sword;
import utils.ArrayList;

public enum BorderManager {

	INSTANCE;

	private ArrayList<Border> list = new ArrayList<>();

	private BorderManager() {
		createBorders();
	}

	public ArrayList<Border> getList() {
		return this.list;
	}

	private void createBorders() {

		this.list.addLast(
				new BorderBuilder().classProvinces(HispaniaUlterior.class, Mauritania.class)
						.classTokenInfluence(Ship.class).coordinatesCenter(483, 215)
						.rotateOriginal(20).build());

		this.list.addLast(
				new BorderBuilder().classProvinces(HispaniaCiterior.class, HispaniaUlterior.class)
						.classTokenInfluence(Shield.class).coordinatesCenter(568, 180)
						.rotateOriginal(90).build());

		this.list.addLast(new BorderBuilder().classProvinces(Gallia.class, HispaniaCiterior.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(665, 215).rotateOriginal(150)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(GalliaCisalpina.class, Gallia.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(866, 336).rotateOriginal(150)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(GalliaCisalpina.class, Dalmatia.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(862, 569).rotateOriginal(355)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Dalmatia.class, Macedonia.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(717, 727).rotateOriginal(40)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Macedonia.class, Achaia.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(558, 828).rotateOriginal(70)
				.build());

	}

}
