public class TesterRelationSymetrique1xN {
    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient("pain");
        Ingredient ingredient2 = new Ingredient("beurre");
        Ingredient ingredient3 = new Ingredient("fromage");
        ingredient1.tostring();
        ingredient2.tostring();
        ingredient3.tostring();
        //QUESTION 5A
        System.out.println("QUESTION 5 A : \n");
        PlatCuisine plat1 = new PlatCuisine("tartineBeuree");
        PlatCuisine plat2 = new PlatCuisine("fromageSeul");
        plat1.ajouterIngredient(ingredient1);
        plat2.ajouterIngredient(ingredient3);
        plat1.lierIngredient(ingredient2);
        System.out.println("AFFICHAGE DES PLATS : \n");
        plat1.toString1();
        plat2.toString2();

    }
}
