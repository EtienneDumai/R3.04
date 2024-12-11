public abstract class DecorateurDePizza {
    IPizza pizza;
    DecorateurDePizza(IPizza pizza){
        this.pizza = pizza;
    }
    public void setPizzaDecoree(IPizza pizza){
        this.pizza = pizza;
    }
    public IPizza getPizzaDecoree(){
        return this.pizza;
    }
}
