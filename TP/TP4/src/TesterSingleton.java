public class TesterSingleton {
    public static void main(String[] args) {
        //Question A :
        SingletonChefCuisine leCuisinier, leChef;
        //Question B :
        leCuisinier = SingletonChefCuisine.getInstance();
        //Question C :
        leCuisinier.setNom("Navarro");
        //Question D :
        leChef = SingletonChefCuisine.getInstance();
        //Question E :
        System.out.println("Nom du chef : " + leChef.getNom());

    }
}