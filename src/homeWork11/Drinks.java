package homeWork11;

public class Drinks {

    public static int totalPrice = 0;

    DrinksMachine createCoffee = DrinksMachine.COFFEE;
    DrinksMachine createTea = DrinksMachine.TEA;
    DrinksMachine createLemonade = DrinksMachine.LEMONADE;
    DrinksMachine createMojito = DrinksMachine.MOJITO;
    DrinksMachine createMineral = DrinksMachine.MINERAL;
    DrinksMachine createCocaCola = DrinksMachine.COCA_COLA;

    public Drinks(int priceCoffee, int priceTea, int priceLemonade, int priceMojito, int priceMineral, int priceCoca_cola) {
        this.createCoffee.setPrice(priceCoffee);
        this.createTea.setPrice(priceTea);
        this.createLemonade.setPrice(priceLemonade);
        this.createMojito.setPrice(priceMojito);
        this.createMineral.setPrice(priceMineral);
        this.createCocaCola.setPrice(priceCoca_cola);
    }
}