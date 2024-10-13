public class Ingredient {
    private String libelle;
    private PlatCuisine monPlat;
    public Ingredient(String libelle) {
        this.libelle = libelle;
    }
    public Ingredient(PlatCuisine monPlat) {
        this.monPlat = monPlat;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public PlatCuisine getMonPlat() {
        return monPlat;
    }
    public void setMonPlat(PlatCuisine monPlat) {
        this.monPlat = monPlat;
    }

    public void tostring() {
        System.out.println("Libelle : " + libelle);
    }
    public void lierPlatCuisine(PlatCuisine Plat) {
        this.monPlat = null;
        this.monPlat = Plat;
        Plat.lierIngredient(this);
    }
    public void delierPlatCuisine(PlatCuisine Plat) {
        this.monPlat = null;
        Plat.delierIngredient(this);


    }
}
