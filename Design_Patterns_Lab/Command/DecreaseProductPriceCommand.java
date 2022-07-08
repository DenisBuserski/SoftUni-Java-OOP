package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Lab.Command;

public class DecreaseProductPriceCommand implements Command {
    private final Product product;
    private final int amount;

    public DecreaseProductPriceCommand(Product product, int amount){
        this.product = product;
        this.amount = amount;
    }

    public String executeAction() {
        this.product.decreasePrice(this.amount);
        return String.format("The price for the %s has been decreased by %d$.%n",
                this.product.getName(), this.amount);
    }
}

