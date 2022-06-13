package BarracksWars_A_New_Factory_03.contracts;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
