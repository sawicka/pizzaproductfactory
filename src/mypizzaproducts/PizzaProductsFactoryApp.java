package mypizzaproducts;

public class PizzaProductsFactoryApp {

    public static void main(String[] args) {
        PizzaProductsFactory italianFactory = new ItalianPizzaProductsFactory();
        Dough italianDough = italianFactory.createDough();
        Sauce italianSauce = italianFactory.createSauce();
        Cheese italianCheese = italianFactory.createCheese();
        System.out.println(italianFactory.getClass().getSimpleName() + " created:"
                + "\n" + italianDough.getClass().getSimpleName()
                + "\n" + italianSauce.getClass().getSimpleName()
                + "\n" + italianCheese.getClass().getSimpleName()
        );

        System.out.println(" ---------------- ");

        PizzaProductsFactory americanFactory = new AmericanPizzaProductsFactory();
        Dough americanDough = americanFactory.createDough();
        Sauce americanSauce = americanFactory.createSauce();
        Cheese americanCheese = americanFactory.createCheese();

        System.out.println(americanFactory.getClass().getSimpleName() + " created:"
                + "\n" + americanDough.getClass().getSimpleName()
                + "\n" + americanSauce.getClass().getSimpleName()
                + "\n" + americanCheese.getClass().getSimpleName()
        );

    }
}
