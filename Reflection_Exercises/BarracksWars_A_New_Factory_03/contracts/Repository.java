package BarracksWars_A_New_Factory_03.contracts;

import jdk.jshell.spi.ExecutionControl;

public interface Repository {

	void addUnit(Unit unit);

	String getStatistics();

	void removeUnit(String unitType) throws ExecutionControl.NotImplementedException;
}
