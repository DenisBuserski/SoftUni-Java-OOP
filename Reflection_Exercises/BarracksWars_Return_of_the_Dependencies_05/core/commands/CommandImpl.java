package BarracksWars_Return_of_the_Dependencies_05.core.commands;

import BarracksWars_Return_of_the_Dependencies_05.contracts.Executable;

public abstract class CommandImpl implements Executable {
    private String[] data;

    protected CommandImpl(String[] data) {
        this.data = data;

    }

    protected String[] getData() {
        return data;
    }

}
