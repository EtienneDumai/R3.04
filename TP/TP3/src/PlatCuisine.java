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
        boolean retour = false;
        if (!getMesIngredient().isEmpty()){
            for (Ingredient ingredient : getMesIngredient()) {
                if(ingredient == unIngredient){
                    retour = true;
                }
            }
        }
        return retour;
    }

    public boolean ajouterIngredient(Ingredient unIngredient){
        this.mesIngredient = new ArrayList<>();
        this.mesIngredient.add(unIngredient);
        return true;
    }
    public boolean retirerIngredient(Ingredient unIngredient){
        boolean retour = false;
        retour = this.mesIngredient.remove(unIngredient);
        return retour;
    }
    public boolean lierIngredient(Ingredient unIngredient){
        boolean retour = false;
        if(this.mesIngredient.add(unIngredient)){
            unIngredient.setMonPlat(this);
            retour = true;
        }
        return retour;
    }
    public boolean delierIngredient(Ingredient unIngredient){
        boolean retour = false;
        if(this.mesIngredient.remove(unIngredient)){
            unIngredient.setMonPlat(null);
            retour = true;
        }
        return retour;
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
