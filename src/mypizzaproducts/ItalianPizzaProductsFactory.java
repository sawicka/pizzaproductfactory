package mypizzaproducts;

public class ItalianPizzaProductsFactory extends PizzaProductsFactory{
    @Override
    public Dough createDough() {
        return new ItalianDough();
    }

    @Override
    public Sauce createSauce() {
        return new ItalianSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ItalianCheese();
    }
}
