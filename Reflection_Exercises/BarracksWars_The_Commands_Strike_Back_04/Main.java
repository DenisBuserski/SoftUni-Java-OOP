package BarracksWars_The_Commands_Strike_Back_04;

import BarracksWars_The_Commands_Strike_Back_04.contracts.Repository;
import BarracksWars_The_Commands_Strike_Back_04.contracts.Runnable;
import BarracksWars_The_Commands_Strike_Back_04.contracts.UnitFactory;
import BarracksWars_The_Commands_Strike_Back_04.core.Engine;
import BarracksWars_The_Commands_Strike_Back_04.core.factories.UnitFactoryImpl;
import BarracksWars_The_Commands_Strike_Back_04.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(repository, unitFactory);
		engine.run();
	}
}
