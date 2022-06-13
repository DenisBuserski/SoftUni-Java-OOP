package BarracksWars_The_Commands_Strike_Back_04.core.commands;

import BarracksWars_The_Commands_Strike_Back_04.contracts.Executable;
import BarracksWars_The_Commands_Strike_Back_04.contracts.Repository;
import BarracksWars_The_Commands_Strike_Back_04.contracts.UnitFactory;

public abstract class CommandImpl implements Executable {
    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    protected CommandImpl(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    protected String[] getData() {
        return data;
    }

    protected Repository getRepository() {
        return repository;
    }

    protected UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
