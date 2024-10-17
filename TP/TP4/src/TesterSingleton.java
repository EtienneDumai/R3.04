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
        //Question F : (il faut supprimer le code des questions d'avant pour que cela marche)
        SingletonChefCuisine leCuisinier2, leChef2;
        leCuisinier2 = SingletonChefCuisine.getInstance("Leroy", "Jean");
        leChef2 = SingletonChefCuisine.getInstance();
        System.out.println("Nom du chef 2 : " + leChef2.getNom());
    }
}