package BarracksWars_A_New_Factory_03.core.factories;


import BarracksWars_A_New_Factory_03.interfaces.Unit;
import BarracksWars_A_New_Factory_03.interfaces.UnitFactory;
import BarracksWars_A_New_Factory_03.models.units.*;
import jdk.jshell.spi.ExecutionControl;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME = "barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException {
//		// TODO: implement for problem 3
//		throw new ExecutionControl.NotImplementedException("message");
		switch (unitType) {
			case "Archer":
				return new Archer();
			case "Pikeman":
				return new Pikeman();
			case "Swordsman":
				return new Swordsman();
			case "Gunner":
				return new Gunner();
			case "Horseman":
				return new Horseman();
		}
		return null;
	}
}
