public class DecorateurAvecChampignons extends DecorateurDePizza {
    public DecorateurAvecChampignons(IPizza pizza){
        super(pizza);
    }
    public void ToString(){
        this.pizza.ToString();
        System.out.println("avec champignons");
    }

}
