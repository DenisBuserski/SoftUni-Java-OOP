package BarracksWars_A_New_Factory_03;

import BarracksWars_A_New_Factory_03.core.Engine;
import BarracksWars_A_New_Factory_03.core.factories.UnitFactoryImpl;
import BarracksWars_A_New_Factory_03.data.UnitRepository;
import BarracksWars_A_New_Factory_03.interfaces.Repository;
import BarracksWars_A_New_Factory_03.interfaces.UnitFactory;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();

        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
