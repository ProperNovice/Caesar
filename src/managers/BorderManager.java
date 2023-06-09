package managers;

import borders.Border;
import borders.BorderBuilder;
import provinces.Achaia;
import provinces.Aegyptus;
import provinces.Africa;
import provinces.Asia;
import provinces.Creta;
import provinces.Cyrene;
import provinces.Dalmatia;
import provinces.Gallia;
import provinces.GalliaCisalpina;
import provinces.HispaniaCiterior;
import provinces.HispaniaUlterior;
import provinces.Italia;
import provinces.Macedonia;
import provinces.Mauritania;
import provinces.Numidia;
import provinces.Sardinia;
import provinces.Sicilia;
import provinces.Syria;
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

		this.list.addLast(new BorderBuilder().classProvinces(Creta.class, Asia.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(468, 937).rotateOriginal(345)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Asia.class, Syria.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(427, 1194).rotateOriginal(40)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Aegyptus.class, Syria.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(175, 1142).rotateOriginal(350)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Cyrene.class, Aegyptus.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(161, 937).rotateOriginal(10)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Africa.class, Cyrene.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(183, 742).rotateOriginal(0)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Numidia.class, Africa.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(269, 561).rotateOriginal(20)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Mauritania.class, Numidia.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(407, 398).rotateOriginal(20)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Asia.class, Aegyptus.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(368, 1040).rotateOriginal(100)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Creta.class, Aegyptus.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(326, 959).rotateOriginal(10)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Creta.class, Cyrene.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(296, 856).rotateOriginal(100)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Achaia.class, Creta.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(380, 800).rotateOriginal(40)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Africa.class, Achaia.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(369, 709).rotateOriginal(330)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Sicilia.class, Africa.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(383, 621).rotateOriginal(40)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Sicilia.class, Numidia.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(435, 493).rotateOriginal(140)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Sardinia.class, Mauritania.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(492, 370).rotateOriginal(90)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Sardinia.class, Sicilia.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(524, 471).rotateOriginal(40)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Gallia.class, Sardinia.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(666, 372).rotateOriginal(50)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Italia.class, Sardinia.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(641, 472).rotateOriginal(130)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(GalliaCisalpina.class, Italia.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(716, 516).rotateOriginal(80)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Dalmatia.class, Italia.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(702, 618).rotateOriginal(130)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Italia.class, Macedonia.class)
				.classTokenInfluence(Shield.class).coordinatesCenter(584, 715).rotateOriginal(330)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Italia.class, Achaia.class)
				.classTokenInfluence(Ship.class).coordinatesCenter(480, 695).rotateOriginal(40)
				.build());

		this.list.addLast(new BorderBuilder().classProvinces(Italia.class, Sicilia.class)
				.classTokenInfluence(Sword.class).coordinatesCenter(542, 565).rotateOriginal(140)
				.build());

	}

}
