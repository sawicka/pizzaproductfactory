package mypizzaproducts;

public class AmericanPizzaProductsFactory extends PizzaProductsFactory{
    @Override
    public Dough createDough() {
        return new AmericanDough();
    }

    @Override
    public Sauce createSauce() {
        return new AmericanSauce();
    }

    @Override
    public Cheese createCheese() {
        return new AmericanCheese();
    }
}
