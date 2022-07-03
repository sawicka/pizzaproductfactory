package mypizzaproducts;

public abstract class PizzaProductsFactory {
    public abstract Dough createDough();
    public abstract Sauce createSauce();
    public abstract Cheese createCheese();

}
