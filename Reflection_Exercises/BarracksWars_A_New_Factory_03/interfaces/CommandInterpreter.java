package BarracksWars_A_New_Factory_03.interfaces;


public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
