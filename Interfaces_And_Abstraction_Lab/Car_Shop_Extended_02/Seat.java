package Interfaces_And_Abstraction_Lab.Car_Shop_Extended_02;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer horsepower, String countryProduced, Double price) {
        super(model, color, horsepower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

}
