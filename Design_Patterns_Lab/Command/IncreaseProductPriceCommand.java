package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Lab.Command;

public class IncreaseProductPriceCommand implements Command {
    private final Product product;
    private final int amount;

    public IncreaseProductPriceCommand(Product product, int amount){
        this.product = product;
        this.amount = amount;
    }

    public String executeAction() {
        this.product.increasePrice(this.amount);
        return String.format("The price for the %s has been increased by %d$.%n",
                this.product.getName(), this.amount);
    }
}


