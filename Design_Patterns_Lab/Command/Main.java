package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Design_Patterns_Lab.Command;

public class Main {
    public static void main(String[] args) {
        ModifyPrice modifyPrice = new ModifyPrice();
        Product product = new Product("Phone",500);

        execute(modifyPrice, new IncreaseProductPriceCommand(product, 100));
        execute(modifyPrice, new IncreaseProductPriceCommand(product, 50));
        execute(modifyPrice, new DecreaseProductPriceCommand(product, 25));

        System.out.println(product);
    }
    private static void execute(ModifyPrice modifyPrice, Command productCommand){
        modifyPrice.setCommand(productCommand);
        modifyPrice.invoke();
    }
}


