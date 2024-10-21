import java.util.ArrayList;
import java.util.Iterator;

public class PlatCuisine {
    private String libelle;
    ArrayList<Ingredient> mesIngredient;
    public PlatCuisine(String libelle) {
        setLibelle(libelle);
        setMesIngredient(mesIngredient);
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public ArrayList<Ingredient> getMesIngredient() {
        return mesIngredient;
    }
    public void setMesIngredient(ArrayList<Ingredient> mesIngredient) {
        this.mesIngredient = mesIngredient;
    }
    public boolean existeIngredient(Ingredient unIngredient) {
        return (getMesIngredient().contains(unIngredient));

    }

    public boolean ajouterIngredient(Ingredient unIngredient){
        boolean ajouter;
        if (ajouter = (! existeIngredient(unIngredient)))
            mesIngredient.add(unIngredient);
        return ajouter;
    }
    public boolean retirerIngredient(Ingredient unIngredient){
        boolean retirer;
        if(retirer = existeIngredient (unIngredient))
            mesIngredient.remove(unIngredient);
        return retirer;

    }
    public boolean lierIngredient(Ingredient unIngredient){
        boolean lier; // Résultat à retourner
        if(! existeIngredient (unIngredient)) { // S'il n'est pas présent dans la liste
            ajouterIngredient(unIngredient); // l'ajouter, puis
            unIngredient.delierPlatCuisine(); // supprimer son lien éventuel
            unIngredient.setMonPlat(this); // et le faire pointer vers moi
            lier = true;
        }
        else lier = false;
        return lier;

    }
    public boolean delierIngredient(Ingredient unIngredient){
        boolean delier;
        if (delier = retirerIngredient (unIngredient)) // Mémorise le résultat de la suppression
            unIngredient.setMonPlat(null); // l'ingrédient ne doit plus pointer vers moi
        return delier;

    }
    public void tostring(){
        System.out.println("Libelle: " + libelle);
        for (Ingredient ingredient : mesIngredient) {
            ingredient.tostring();
        }
    }
    public void toString1(){
        String message; // Le résultat est du type String
        message = "Plat cuisiné : "+ getLibelle();
        if (! getMesIngredient().isEmpty()) {
            message += " composé de ( ";
            for (int i = 0; i < mesIngredient.size(); i++) { // Accès avec i du type int
                message += mesIngredient.get(i).getLibelle()+" ";
            }
            message += ")";
        }
        System.out.println(message);
    }
    public void toString2(){
        String message;
        message = "Plat cuisiné : "+getLibelle();
        if (! getMesIngredient().isEmpty()) {
            message += " composé de ( ";
            for (Ingredient ingredient : getMesIngredient()) { // Accès avec ingredient du type Ingredients
                message += ingredient.getLibelle()+" ";
            }
            message += ")";
        }
        System.out.println(message);
    }
    public void toString3(){
        String message;
        message = "Plat cuisiné : "+getLibelle();
        if (! getMesIngredient().isEmpty()) {
            message += " composé de ( ";
            Iterator<Ingredient> it = getMesIngredient().iterator(); // Accès avec it du type Iterator<Ingredients>
            while (it.hasNext()) {
                message += it.next().getLibelle()+" ";
            }
            message += ")";
        }
        System.out.println(message);

    }
}
