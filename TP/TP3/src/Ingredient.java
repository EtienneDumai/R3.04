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
        this.delierPlatCuisine(); // Se délier du plat avec lequel il est ventuellement lié,
        this.setMonPlat(monPlat); // pointer vers le nouveau plat, et
        monPlat.ajouterIngredient (this);
    }
    public void delierPlatCuisine() {
        if (this.getMonPlat() != null) { // Si l’ingrédient est lié à un plat,
// le retirer de la liste de ses ingrédients, et
            this.getMonPlat().delierIngredient(this);
// ne plus pointer vers le plat.
            this.setMonPlat(null);
        }
    }
}
