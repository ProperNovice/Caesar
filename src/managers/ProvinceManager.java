package managers;

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
import provinces.Province;
import provinces.Sardinia;
import provinces.Sicilia;
import provinces.Syria;
import utils.ArrayList;

public enum ProvinceManager {

	INSTANCE;

	private ArrayList<Province> list = new ArrayList<>();

	private ProvinceManager() {
		createProvinces();
	}

	public void setUpStartingTokenProvince() {

		for (Province province : this.list)
			province.setUpTokenProvince();

	}

	private void createProvinces() {

		this.list.addLast(new Italia());
		this.list.addLast(new Achaia());
		this.list.addLast(new Aegyptus());
		this.list.addLast(new Africa());
		this.list.addLast(new Asia());
		this.list.addLast(new Creta());
		this.list.addLast(new Cyrene());
		this.list.addLast(new Dalmatia());
		this.list.addLast(new Gallia());
		this.list.addLast(new GalliaCisalpina());
		this.list.addLast(new HispaniaCiterior());
		this.list.addLast(new HispaniaUlterior());
		this.list.addLast(new Macedonia());
		this.list.addLast(new Mauritania());
		this.list.addLast(new Numidia());
		this.list.addLast(new Sardinia());
		this.list.addLast(new Sicilia());
		this.list.addLast(new Syria());

		this.list.saveOriginal();

	}

}
