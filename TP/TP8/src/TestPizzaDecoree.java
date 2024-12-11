public class TestPizzaDecoree {
    public static void main(String[] args) {
    PizzaDeBase pizza = new PizzaDeBase();
    System.out.println("Pizza de base");
    pizza.ToString();
    IPizza autrePizza = new PizzaDeBase();
    autrePizza = new DecorateurAvecOlives(autrePizza);
    }
}
