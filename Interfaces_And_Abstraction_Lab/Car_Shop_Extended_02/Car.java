package Interfaces_And_Abstraction_Lab.Car_Shop_Extended_02;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();

}
