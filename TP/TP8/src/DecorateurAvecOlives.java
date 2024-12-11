public class DecorateurAvecOlives extends DecorateurDePizza {
    public DecorateurAvecOlives(IPizza pizza){
        super(pizza);
    }
    public void ToString(){
        this.pizza.ToString();
        System.out.println("avec olives");
    }

}
