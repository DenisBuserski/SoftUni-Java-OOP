package BarracksWars_Return_of_the_Dependencies_05;

import BarracksWars_Return_of_the_Dependencies_05.contracts.Repository;
import BarracksWars_Return_of_the_Dependencies_05.contracts.Runnable;
import BarracksWars_Return_of_the_Dependencies_05.contracts.UnitFactory;
import BarracksWars_Return_of_the_Dependencies_05.core.CommandInterpreterImpl;
import BarracksWars_Return_of_the_Dependencies_05.core.Engine;
import BarracksWars_Return_of_the_Dependencies_05.core.factories.UnitFactoryImpl;
import BarracksWars_Return_of_the_Dependencies_05.data.UnitRepository;

public class Main {

	public static void main(String[] args) {
		Repository repository = new UnitRepository();
		UnitFactory unitFactory = new UnitFactoryImpl();
		Runnable engine = new Engine(new CommandInterpreterImpl(repository,unitFactory));
		engine.run();
	}
}
